package domain.login

import SharedViewModel
import data.YouTubeApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class LoginViewModel() : SharedViewModel() {

    val token = MutableStateFlow("")

    private val repo = ChannelSubscriptionRepo(YouTubeApiService())

    fun callSubscriptionApis() {
        sharedViewModelScope.launch {

        }
    }

    fun saveUserToken(idToken: String?) {
        idToken?.let {
            token.value = it
        }
    }

}