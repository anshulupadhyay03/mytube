package domain.login

import SharedViewModel
import data.YouTubeApiService
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LoginViewModel() : SharedViewModel() {


    private val repo = ChannelSubscriptionRepo(YouTubeApiService())

    fun callSubscriptionApis(token:String) {
        sharedViewModelScope.launch {
            repo.getSubscriptions(token).collect()
        }
    }
}