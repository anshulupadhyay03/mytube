package com.retroentertainment.mytubeverse

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import domain.login.LoginViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<LoginViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(viewModel)
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(LoginViewModel())
}