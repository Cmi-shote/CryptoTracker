package com.plcoding.cryptotracker.crypto.data.networking.dataTransferObject

import kotlinx.serialization.Serializable

@Serializable //the annotation is necessary for all data classes that we directly want to parse from json into kotlin data class
data class CoinDto (
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,
    val priceUsd: Double,
    val changePercent24Hr: Double
)