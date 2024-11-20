package com.example.currencyconverterapp.data.repository

import com.example.currencyconverterapp.data.local.CurrencyRateDAO
import com.example.currencyconverterapp.data.local.entity.toCurrencyRate
import com.example.currencyconverterapp.data.local.entity.toCurrencyRateEntity
import com.example.currencyconverterapp.data.remote.CurrencyApi
import com.example.currencyconverterapp.data.remote.dto.toCurrencyRates
import com.example.currencyconverterapp.domain.model.CurrencyRate
import com.example.currencyconverterapp.domain.model.Resource
import com.example.currencyconverterapp.domain.repository.CurrencyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class CurrencyRepositoryImpl(
    private val api: CurrencyApi,
    private val dao: CurrencyRateDAO
) : CurrencyRepository {

    override fun getCurrencyRatesList(): Flow<Resource<List<CurrencyRate>>> = flow {
        val localCurrencyRates = getLocalCurrencyRates()
        emit(Resource.Success(localCurrencyRates))

        try {
            val newRates = getRemoteCurrencyRates()
            updateLocalCurrencyRates(newRates)
            emit(Resource.Success(newRates))
        } catch (
            e: IOException
        ) {
            emit(
                Resource.Error(
                    message = "Check your internet connection!",
                    data = localCurrencyRates
                )
            )
        } catch (
            e: Exception
        ) {
            emit(
                Resource.Error(
                    message = "Something went wrong! ${e.message}",
                    data = localCurrencyRates
                )
            )
        }
    }

    private suspend fun getLocalCurrencyRates(): List<CurrencyRate> {
        return dao.getAllCurrencyRates().map { it.toCurrencyRate() }
    }

    private suspend fun getRemoteCurrencyRates(): List<CurrencyRate> {
        val response = api.getLatestRates()
        return response.toCurrencyRates()
    }

    private suspend fun updateLocalCurrencyRates(currencyRates: List<CurrencyRate>) {
        dao.upsertAll(currencyRates.map { it.toCurrencyRateEntity() })
    }

}