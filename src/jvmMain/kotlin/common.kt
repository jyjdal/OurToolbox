import androidx.compose.runtime.Composable

interface Plugin {
    fun getName(): String

    fun getAuthor(): String

    fun getDescription(): String

    @Composable
    fun getUi()
}
