import kotlinx.coroutines.CoroutineScope

expect open class SharedViewModel() {

    val sharedViewModelScope: CoroutineScope

    protected open fun onCleared()
}