package com.retroentertainment.mytubeverse

import GoogleButtonUiContainer
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.credentials.CredentialManager
import com.retroentertainment.mytubeverse.login.GoogleAuthProviderImpl
import domain.login.GoogleAuthCredentials
import domain.login.GoogleUser
import domain.login.LoginViewModel
import mytubeverse.composeapp.generated.resources.Res
import mytubeverse.composeapp.generated.resources.compose_multiplatform

@Composable
fun LoginScreen(viewModel: LoginViewModel) {

    val credentials =
        GoogleAuthCredentials("1093375705839-na8i48n2katiemscig24e37et9c82h5k.apps.googleusercontent.com")
    val credentialManager = CredentialManager.create(LocalContext.current)
    val googleAuthProvider =
        GoogleAuthProviderImpl(credentials, credentialManager)

    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            org.jetbrains.compose.resources.painterResource(Res.drawable.compose_multiplatform),
            null
        )

        Spacer(modifier = Modifier.padding(50.dp))
        GoogleButtonUiContainer(
            googleAuthProvider,
            onGoogleSignInResult = { googleUser ->
                val idToken = googleUser?.idToken // Send this idToken to your backend to verify
                //signedInUser = googleUser
                handleSuccessLogin(googleUser)
            }) {
            Button(
                onClick = { this.onClick() }
            ) {
                Text("Sign-In with Google")
            }
        }

    }
}

fun handleSuccessLogin(googleUser: GoogleUser?) {
    val displayName = googleUser?.displayName
    Log.i("Ansh", " user is $displayName and the token is ${googleUser?.idToken}")
}
