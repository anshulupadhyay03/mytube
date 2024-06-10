package data

import data.networking.YT_BASE_URL
import io.ktor.client.request.*
import io.ktor.http.*

/**
 * Use this method for configuring the request url
 */
fun HttpRequestBuilder.apiUrl(path: String) {
    url {
        takeFrom(YT_BASE_URL)
        path(path)
    }
}