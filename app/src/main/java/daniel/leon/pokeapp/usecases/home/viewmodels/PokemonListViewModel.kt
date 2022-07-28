package daniel.leon.pokeapp.usecases.home.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import daniel.leon.pokeapp.data.PokemonListRepository
import daniel.leon.pokeapp.model.PokemonListDataClass

class PokemonListViewModel(pokemonListRepository: PokemonListRepository) : ViewModel() {



   /*fun getPokemonList(): PokemonListDataClass {

       val res = PokemonListRepository().getPokemonList()
       for (result in listOf(res)) {
           Log.i("pokemon-names: ", "$result.name")
           Log.i("pokemon-url: ", "$result.url")
       }
       return PokemonListRepository().getPokemonList()
    }*/
}