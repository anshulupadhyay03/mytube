package domain.login

import data.YouTubeApiService
import kotlinx.coroutines.flow.Flow

class ChannelSubscriptionRepo(private val service: YouTubeApiService) {
    suspend fun getSubscriptions(token: String): Flow<String> {
        return service.getChannelSubscription(token)
    }

}
