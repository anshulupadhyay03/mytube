package com.retroentertainment.mytubeverse

import App
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import domain.login.LoginViewModel
import kotlinx.coroutines.flow.map

val Context.tubeStore by preferencesDataStore("MyTubeVerse")

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
    App(LoginViewModel(/*DataStoreUtil(LocalContext.current.tubeStore)*/))
}

class DataStoreUtil(private val tubeStore: DataStore<Preferences>) {
    fun save(key: Preferences.Key<String>, value: String) {
        tubeStore.data.map { preferences ->
            preferences[key] ?: value
        }

    }
}