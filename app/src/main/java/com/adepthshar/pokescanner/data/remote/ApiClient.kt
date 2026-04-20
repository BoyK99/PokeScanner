import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    val api: PokemonApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.pokemontcg.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokemonApiService::class.java)
    }
}