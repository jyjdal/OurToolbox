package plugin

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class TestPlugin : Plugin {
    override fun getName(): String = "TestPlugin"
    override fun getAuthor(): String = "Harlie"
    override fun getDescription(): String = "A test plugin."

    @Composable  // 这里的注解不能被子类继承，因此需要手动重写
    override fun getUi() {
        Button(onClick = {
            println("Hello, TestPlugin!")
        }) {
            Text("TestPlugin ${getName()}")
        }
    }
}

interface Plugin {
    fun getName(): String

    fun getAuthor(): String

    fun getDescription(): String

    @Composable
    fun getUi()
}
