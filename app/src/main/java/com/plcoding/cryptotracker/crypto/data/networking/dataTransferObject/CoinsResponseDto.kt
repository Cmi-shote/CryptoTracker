package com.plcoding.cryptotracker.crypto.data.networking.dataTransferObject

import kotlinx.serialization.Serializable

@Serializable
data class CoinsResponseDto(
    val data: List<CoinDto>
)
