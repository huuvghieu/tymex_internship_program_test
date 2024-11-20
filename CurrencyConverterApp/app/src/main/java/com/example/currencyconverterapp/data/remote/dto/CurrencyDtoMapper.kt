package com.example.currencyconverterapp.data.remote.dto

import com.example.currencyconverterapp.domain.model.CurrencyRate

fun CurrencyDTO.toCurrencyRates(): List<CurrencyRate> {
    val currencyData = this.data
    return listOf(
        CurrencyRate("AUD", "Australian Dollar", currencyData.AUD),
        CurrencyRate("BGN", "Bulgarian Lev", currencyData.BGN),
        CurrencyRate("BRL", "Brazilian Real", currencyData.BRL),
        CurrencyRate("CAD", "Canadian Dollar", currencyData.CAD),
        CurrencyRate("CHF", "Swiss Franc", currencyData.CHF),
        CurrencyRate("CNY", "Chinese Yuan", currencyData.CNY),
        CurrencyRate("CZK", "Czech Koruna", currencyData.CZK),
        CurrencyRate("DKK", "Danish Krone", currencyData.DKK),
        CurrencyRate("EUR", "Euro", currencyData.EUR),
        CurrencyRate("GBP", "British Pound", currencyData.GBP),
        CurrencyRate("HKD", "Hong Kong Dollar", currencyData.HKD),
        CurrencyRate("HRK", "Croatian Kuna", currencyData.HRK),
        CurrencyRate("HUF", "Hungarian Forint", currencyData.HUF),
        CurrencyRate("IDR", "Indonesian Rupiah", currencyData.IDR),
        CurrencyRate("ILS", "Israeli Shekel", currencyData.ILS),
        CurrencyRate("INR", "Indian Rupee", currencyData.INR),
        CurrencyRate("ISK", "Icelandic Krona", currencyData.ISK),
        CurrencyRate("JPY", "Japanese Yen", currencyData.JPY),
        CurrencyRate("KRW", "South Korean Won", currencyData.KRW),
        CurrencyRate("MXN", "Mexican Peso", currencyData.MXN),
        CurrencyRate("MYR", "Malaysian Ringgit", currencyData.MYR),
        CurrencyRate("NOK", "Norwegian Krone", currencyData.NOK),
        CurrencyRate("NZD", "New Zealand Dollar", currencyData.NZD),
        CurrencyRate("PHP", "Philippine Peso", currencyData.PHP),
        CurrencyRate("PLN", "Polish Zloty", currencyData.PLN),
        CurrencyRate("RON", "Romanian Leu", currencyData.RON),
        CurrencyRate("RUB", "Russian Ruble", currencyData.RUB),
        CurrencyRate("SEK", "Swedish Krona", currencyData.SEK),
        CurrencyRate("SGD", "Singapore Dollar", currencyData.SGD),
        CurrencyRate("THB", "Thai Baht", currencyData.THB),
        CurrencyRate("TRY", "Turkish Lira", currencyData.TRY),
        CurrencyRate("USD", "United States Dollar", currencyData.USD),
        CurrencyRate("ZAR", "South African Rand", currencyData.ZAR)
    )
}