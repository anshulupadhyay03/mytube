import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import domain.login.GoogleAuthProvider
import domain.login.GoogleUser
import kotlinx.coroutines.launch

interface GoogleButtonUiContainerScope {
    fun onClick()
}

@Composable
fun GoogleButtonUiContainer(
    googleAuthProvider:GoogleAuthProvider,
    modifier: Modifier = Modifier,
    onGoogleSignInResult: (GoogleUser?) -> Unit,
    content: @Composable GoogleButtonUiContainerScope.() -> Unit,

) {

    val googleAuthUiProvider = googleAuthProvider.getUiProvider()
    val coroutineScope = rememberCoroutineScope()
    val uiContainerScope = remember {
        object : GoogleButtonUiContainerScope {
            override fun onClick() {
                coroutineScope.launch {
                    val googleUser = googleAuthUiProvider.signIn()
                    onGoogleSignInResult(googleUser)
                }
            }
        }
    }
    Surface(
        modifier = modifier,
        content = { uiContainerScope.content() }
    )

}