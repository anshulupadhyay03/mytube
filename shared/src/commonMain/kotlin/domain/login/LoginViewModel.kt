package domain.login

import SharedViewModel
import data.YouTubeApiService
import kotlinx.coroutines.launch

class LoginViewModel : SharedViewModel() {



    private val repo = ChannelSubscriptionRepo(YouTubeApiService())

    fun callSubscriptionApis() {
        sharedViewModelScope.launch {

        }
    }

}