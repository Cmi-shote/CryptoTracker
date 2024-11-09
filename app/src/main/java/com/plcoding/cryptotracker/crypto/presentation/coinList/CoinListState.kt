package com.plcoding.cryptotracker.crypto.presentation.coinList

import androidx.compose.runtime.Immutable
import com.plcoding.cryptotracker.crypto.presentation.models.CoinUI

@Immutable //tells the compiler that the class would not change
data class CoinListState (
    val isLoading: Boolean = false, //used to display progress bar
    val coins: List<CoinUI> = emptyList(),
    val selectedCoin: CoinUI? = null
)