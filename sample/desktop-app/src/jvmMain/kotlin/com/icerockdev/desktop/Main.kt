package com.icerockdev.desktop

import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import com.icerockdev.library.Testing


fun main() {
    val testing = Testing

    Window("moko") {
        Surface(Modifier.fillMaxSize()) {
            Text(testing.getStrings().first().localized())
        }
    }
}