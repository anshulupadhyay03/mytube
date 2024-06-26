package domain.login

import androidx.compose.runtime.Composable

interface GoogleAuthProvider {
    @Composable
    fun getUiProvider(): GoogleAuthUiProvider

    suspend fun signOut()
}