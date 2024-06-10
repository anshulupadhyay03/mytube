package data.networking

import di.Network
import io.ktor.client.call.body
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get
import io.ktor.client.request.parameter

suspend inline fun <reified T> doGet(noinline block: HttpRequestBuilder.() -> Unit) : T {
   return Network.httpClient.get{
        block()
       parameter("with_origin_country", "IN")
       parameter("api_key", "c17a061aa446b55bac02aa6ece199709")
    }.body()
}
