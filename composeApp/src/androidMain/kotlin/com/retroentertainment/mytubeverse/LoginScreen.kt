package com.retroentertainment.mytubeverse

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import domain.login.LoginViewModel

@Composable
fun LoginScreen(viewModel: LoginViewModel) {

    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { viewModel.callSubscriptionApis() }) {
            Text("Click me!")
        }
    }
}