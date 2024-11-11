package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId : String,
        start: ZonedDateTime, //ZonedDateTime object contains information of the current time and time zone
        end: ZonedDateTime,
    ) : Result<List<CoinPrice>, NetworkError>
}