package daniel.leon.pokeapp.providers

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import daniel.leon.pokeapp.providers.services.ApiServices
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.text.DateFormat


//TODO Set your Base URL
private val BASE_URL = "https://pokeapi.co/api/v2/"

/*
private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

object RestClient {
    val apiService: ApiServices by lazy {
        retrofit.create(ApiServices::class.java)
    }
}*/
class DataProvider {

    fun getRestEngine(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS)
        val client = OkHttpClient.Builder().apply {
            addInterceptor(interceptor)
        }.build()
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun logout() {
        // TODO: revoke authentication
    }
}