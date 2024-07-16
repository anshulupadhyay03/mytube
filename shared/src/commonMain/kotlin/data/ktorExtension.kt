package data

import data.networking.YT_BASE_URL
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.http.path
import io.ktor.http.takeFrom

/**
 * Use this method for configuring the request url
 */
fun HttpRequestBuilder.apiUrl(path: String, token: String) {
    url {
        takeFrom(YT_BASE_URL)
        path(path)
        parameter("part", "contentDetails")
        parameter("mine", true)
        //parameter("key", "")
        //parameter("access_token",token)
        header("Authorization", "Bearer $token")
    }
}