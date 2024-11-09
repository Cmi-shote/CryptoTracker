package com.plcoding.cryptotracker.crypto.presentation.coinList

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUI

sealed interface CoinListAction {
    data class OnCoinClick(val coinUI: CoinUI): CoinListAction
}