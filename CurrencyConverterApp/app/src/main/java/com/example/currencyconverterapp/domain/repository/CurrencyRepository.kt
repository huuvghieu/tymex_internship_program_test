package com.example.currencyconverterapp.domain.repository

import kotlinx.coroutines.flow.Flow
import com.example.currencyconverterapp.domain.model.CurrencyRate
import com.example.currencyconverterapp.domain.model.Resource

interface CurrencyRepository {
    fun getCurrencyRatesList(): Flow<Resource<List<CurrencyRate>>>
}