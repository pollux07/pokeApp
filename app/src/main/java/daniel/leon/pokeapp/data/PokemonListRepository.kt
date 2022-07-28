package daniel.leon.pokeapp.data

import android.util.Log
import daniel.leon.pokeapp.model.PokemonListDataClass
import daniel.leon.pokeapp.providers.DataProvider
import daniel.leon.pokeapp.providers.services.ApiServices
import daniel.leon.pokeapp.usecases.home.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class PokemonListRepository(val dataProvider: DataProvider) {


    fun getPokemonList() {
        //var dataList = PokemonListDataClass()
        val apiService = dataProvider.getRestEngine().create(ApiServices::class.java)
        val result = apiService
            .getPokemonList("20", "20")
            .enqueue(object : Callback<PokemonListDataClass> {
                override fun onResponse(
                    call: Call<PokemonListDataClass>,
                    response: Response<PokemonListDataClass>
                ) {
                    MainActivity().PokeList(response.body()!!)
                }

                override fun onFailure(call: Call<PokemonListDataClass>, t: Throwable) {
                    t.printStackTrace()
                    t.message?.let { Log.e("companies", it) }
                }
            })
    }
}
