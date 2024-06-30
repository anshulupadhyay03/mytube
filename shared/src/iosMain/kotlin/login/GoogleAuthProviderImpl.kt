package login

import androidx.compose.runtime.Composable
import domain.login.GoogleAuthProvider
import domain.login.GoogleAuthUiProvider
import kotlinx.cinterop.ExperimentalForeignApi

internal class GoogleAuthProviderImpl :
    GoogleAuthProvider {

    @Composable
    override fun getUiProvider(): GoogleAuthUiProvider = GoogleAuthUiProviderImpl()

    @OptIn(ExperimentalForeignApi::class)
    override suspend fun signOut() {
       // GIDSignIn.sharedInstance.signOut()
    }


}