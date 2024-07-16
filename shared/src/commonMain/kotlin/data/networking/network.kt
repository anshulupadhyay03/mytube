package data.networking

import di.Network
import io.ktor.client.call.body
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get

suspend inline fun <reified T> doGet(noinline block: HttpRequestBuilder.() -> Unit) : T {
   return Network.httpClient.get{
        block()
    }.body()
}
