package com.example.currencyconverterapp.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.currencyconverterapp.data.local.entity.CurrencyRateEntity

@Dao
interface CurrencyRateDAO {

    @Upsert
    suspend fun upsertAll(currencyRates: List<CurrencyRateEntity>)

    @Query("SELECT * FROM currencyrateentity")
    suspend fun getAllCurrencyRates() : List<CurrencyRateEntity>
}