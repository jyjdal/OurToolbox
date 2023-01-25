import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import plugin.Plugin
import plugin.TestPlugin

@Composable
@Preview
fun app() {
    val plugin: Plugin = TestPlugin()
    val pluginName = plugin.getName()

    MaterialTheme {
        Row {
            Column(Modifier.fillMaxWidth(0.4F)) {
                Button(onClick = {}) {
                    Text("Plugin: $pluginName")
                }
            }
            Column {
                plugin.getUi()
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        app()
    }
}
