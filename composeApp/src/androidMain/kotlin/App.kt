import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.datastore.preferences.core.stringPreferencesKey
import com.retroentertainment.mytubeverse.DataStoreUtil
import com.retroentertainment.mytubeverse.LoginScreen
import com.retroentertainment.mytubeverse.tubeStore
import domain.login.LoginViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(viewModel: LoginViewModel) {
    val dataStore = LocalContext.current.tubeStore
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            LoginScreen(viewModel) {
                val dataStoreUtil = DataStoreUtil(dataStore)
                val userTokenkey = stringPreferencesKey("user_token")
                dataStoreUtil.save(userTokenkey, it)
            }
        }
    }
}

