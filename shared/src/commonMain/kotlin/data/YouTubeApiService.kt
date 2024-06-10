package data

import data.networking.CHANNEL_SUBSRIPTION
import data.networking.YT_BASE_URL
import data.networking.doGet
import io.ktor.client.request.parameter
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class YouTubeApiService {

    suspend fun getPopularMovies(pageNo: Int): Flow<String> = flow {
        val result: String = doGet {
            apiUrl("$CHANNEL_SUBSRIPTION")
            parameter("page", pageNo)
        }
        emit(result)
    }


}
