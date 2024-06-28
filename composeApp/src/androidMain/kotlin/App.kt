import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.retroentertainment.mytubeverse.LoginScreen
import domain.login.LoginViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(viewModel: LoginViewModel) {
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            LoginScreen(viewModel)
        }
    }
}

