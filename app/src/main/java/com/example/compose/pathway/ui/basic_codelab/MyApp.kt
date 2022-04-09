package com.example.compose.pathway.ui.basic_codelab

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.pathway.ui.theme.ComposePathwayTheme

@Composable
fun MyApp(names: List<String> = listOf("World", "Compose", "Pathway")) {
    Column(modifier = Modifier.padding(vertical = 4.dp)) {
        for (name in names) {
            Greeting(name)
        }
    }
}

@Composable
private fun Greeting(name: String) {
    var expanded by remember { mutableStateOf(false) }
    val extraPadding = if (expanded) 48.dp else 0.dp
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .animateContentSize()
    ) {
        Row(
            modifier = Modifier.padding(24.dp),
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = extraPadding)
            ) {
                Text(text = "Hello,")
                Text(text = name)
            }

            OutlinedButton(onClick = { expanded = !expanded }) {
                Text(text = if (expanded) "Show less" else "Show more")
            }
        }
    }
}

@Preview(showBackground = true, name = "MyApp", widthDp = 320)
@Composable
private fun DefaultPreview() {
    ComposePathwayTheme(darkTheme = false) {
        MyApp()
    }
}