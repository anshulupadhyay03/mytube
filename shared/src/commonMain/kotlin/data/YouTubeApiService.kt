package data

import data.networking.CHANNEL_SUBSRIPTION
import data.networking.doGet
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class YouTubeApiService {

    suspend fun getChannelSubscription(token: String): Flow<String> = flow {
        val result: String = doGet {
            apiUrl("$CHANNEL_SUBSRIPTION", token)
        }
        println("data is $result")
        emit(result)
    }


}
