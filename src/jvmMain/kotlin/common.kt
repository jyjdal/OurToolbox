import androidx.compose.runtime.Composable
import plugin.TestPlugin

interface Plugin {
    fun getName(): String

    fun getAuthor(): String

    fun getDescription(): String

    @Composable
    fun getUi()
}

fun getPlugins(): MutableList<Plugin> {
    val plugins: MutableList<Plugin> = mutableListOf()
    plugins.add(TestPlugin())
    return plugins
}
