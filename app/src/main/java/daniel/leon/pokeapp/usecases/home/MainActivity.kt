package daniel.leon.pokeapp.usecases.home

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import daniel.leon.pokeapp.data.PokemonListRepository
import daniel.leon.pokeapp.model.PokemonListDataClass
import daniel.leon.pokeapp.providers.DataProvider
import daniel.leon.pokeapp.ui.theme.PokeAppTheme
import daniel.leon.pokeapp.usecases.home.viewmodels.PokemonListViewModel

class MainActivity : ComponentActivity() {

    private lateinit var pokemonListViewModel: PokemonListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //pokemonListViewModel.getPokemonList()

                    //val model: PokemonListViewModel by viewModels()
                    //model.getPokemonList()

                    val model: PokemonListViewModel by viewModels()
                    //model.getPokemonList()

                    PokemonListRepository(DataProvider()).getPokemonList()
                    /*for (r in response.results!!) {
                        Log.i("pokemon-names: ", "$r.name")
                        Log.i("pokemon-url: ", "$r.url")
                    }*/

                }
            }
        }
    }

    fun PokeList(response: PokemonListDataClass) {


        for (r in response.results!!) {
            Log.i("pokemon-names: ", "$r.name")
            Log.i("pokemon-url: ", "$r.url")
        }

    }
}
