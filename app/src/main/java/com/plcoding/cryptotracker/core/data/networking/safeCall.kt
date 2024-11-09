package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result
import io.ktor.client.statement.HttpResponse
import io.ktor.util.network.UnresolvedAddressException
import kotlinx.coroutines.ensureActive
import kotlinx.serialization.SerializationException
import kotlin.coroutines.coroutineContext

//function to make the request
suspend inline fun <reified T> safeCall(
    execute: () -> HttpResponse
) : Result<T, NetworkError> {
    //catch errors that happen before we can get errors from server
    val response = try {
        execute()
    } catch (e: UnresolvedAddressException) { //usually when there is no internet
        return Result.Error(NetworkError.NO_INTERNET)
    } catch (e: SerializationException) {
        return Result.Error(NetworkError.SERIALIZATION)
    } catch (e: Exception) {
        coroutineContext.ensureActive()
        return Result.Error(NetworkError.UNKNOWN_ERROR)
    }

    //successful response
    return responseToResult(response)
}