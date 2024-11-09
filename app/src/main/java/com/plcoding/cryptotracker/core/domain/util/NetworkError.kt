package com.plcoding.cryptotracker.core.domain.util

enum class NetworkError: Error {
    // list errors expected from api
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN_ERROR
}