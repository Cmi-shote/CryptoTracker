package com.plcoding.cryptotracker.di

import com.plcoding.cryptotracker.core.data.networking.HttpClientFactory
import com.plcoding.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import com.plcoding.cryptotracker.crypto.domain.CoinDataSource
import com.plcoding.cryptotracker.crypto.presentation.coinList.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { //provide those dependencies that we want to inject
        HttpClientFactory.create(CIO.create())
    }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()  // or single { RemoteCoinDataSource(get()) }

    //provide instance of viewmodel
    viewModelOf(::CoinListViewModel)
}