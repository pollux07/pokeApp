package daniel.leon.pokeapp.providers.services

import com.google.gson.JsonArray
import daniel.leon.pokeapp.model.PokemonListDataClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiServices {

    @GET("pokemon/")
     fun getPokemonList(
        @Query("limit") limit: String,
        @Query("offset") offset: String
    ): Call<PokemonListDataClass>
}