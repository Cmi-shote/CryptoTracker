package com.plcoding.cryptotracker.crypto.presentation.coinList

import com.plcoding.cryptotracker.core.domain.util.NetworkError

//one time information being sent from the viewmodel to the ui
sealed interface CoinListEvent {
    data class Error(val message: NetworkError): CoinListEvent
}