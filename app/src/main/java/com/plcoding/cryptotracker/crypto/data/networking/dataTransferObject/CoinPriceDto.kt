package com.plcoding.cryptotracker.crypto.data.networking.dataTransferObject

import kotlinx.serialization.Serializable

@Serializable
data class CoinPriceDto(
    val priceUsd: Double,
    val time: Long
)
