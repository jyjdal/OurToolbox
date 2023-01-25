import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun app() {
    val plugins = getPlugins()

    MaterialTheme {
        Row {
            plugins.forEach { plugin ->
                Column(Modifier.fillMaxWidth(0.4F)) {
                    Text("Plugin: ${plugin.getName()}")
                }
                Column {
                    plugin.getUi()
                }
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        app()
    }
}
