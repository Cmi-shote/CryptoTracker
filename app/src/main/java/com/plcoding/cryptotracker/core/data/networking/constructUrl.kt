package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.BuildConfig

fun constructUrl(url: String): String {
    return when {
        url.contains(BuildConfig.BASE_URL) -> url
        url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1) // so if url is /assets, remove the / because the baseurl already has the trailing / and add the base url to the front of it
        else -> BuildConfig.BASE_URL + url
    }
}