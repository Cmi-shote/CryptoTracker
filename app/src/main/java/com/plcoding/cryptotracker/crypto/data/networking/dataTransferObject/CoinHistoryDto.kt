package com.plcoding.cryptotracker.crypto.data.networking.dataTransferObject

import kotlinx.serialization.Serializable

@Serializable
data class CoinHistoryDto(
    val data: List<CoinPriceDto>
)
