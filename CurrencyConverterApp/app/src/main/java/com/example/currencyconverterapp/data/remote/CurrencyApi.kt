package com.example.currencyconverterapp.data.remote

import com.example.currencyconverterapp.data.remote.dto.CurrencyDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("v1/latest")
    suspend fun getLatestRates(
        @Query("apikey") apiKey: String = API_KEY
    ): CurrencyDTO

    companion object {
        const val API_KEY = "fca_live_CQaILMxcMJ2lI6AN1hnrRYndNiw6nmzTo6eGC0FB"
        const val BASE_URL = "https://api.freecurrencyapi.com/"
    }

}