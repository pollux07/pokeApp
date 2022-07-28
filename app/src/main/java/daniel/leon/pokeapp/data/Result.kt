package daniel.leon.pokeapp.data

import daniel.leon.pokeapp.model.PokemonListDataClass

/**
 * A generic class that holds a value with its loading status.
 * @param <T>
 */

sealed class Result<out data : PokemonListDataClass> {

    data class Success(val data: PokemonListDataClass) : Result<PokemonListDataClass>()
    data class Error(val exception: Exception) : Result<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
        }
    }
}
