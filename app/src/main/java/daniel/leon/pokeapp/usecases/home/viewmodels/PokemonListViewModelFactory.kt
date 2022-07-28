package daniel.leon.pokeapp.usecases.home.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import daniel.leon.pokeapp.data.PokemonListRepository
import daniel.leon.pokeapp.providers.DataProvider

class PokemonListViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun<T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PokemonListViewModel::class.java)) {
            return PokemonListViewModel (
                pokemonListRepository = PokemonListRepository(
                    dataProvider = DataProvider()
                )
                    ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}