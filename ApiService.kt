package com.example.currencyconverter

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("latest")
    suspend fun getExchangeRates(
        @Query("base") base: String,
        @Query("apikey") apiKey: String
    ): CurrencyResponse
}
