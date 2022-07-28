package daniel.leon.pokeapp.model

import android.os.Parcelable
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName
import java.net.URL
import com.google.gson.annotations.Expose
import kotlinx.android.parcel.Parcelize

data class PokemonListDataClass(
    @SerializedName("results")
    @Expose
    val results: ArrayList<pokemonDescription>? = null
)

@Parcelize
data class pokemonDescription(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
) : Parcelable


