package com.example.compose.pathway.ui.basic_codelab

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.pathway.ui.theme.ComposePathwayTheme

@Composable
fun OnboardingScreen(onClick: () -> Unit) {
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to the Basics Codelab!")
            Button(onClick = onClick) {
                Text("Continue")
            }
        }
    }
}

@Preview(showBackground = true, name = "Onboarding Light Theme")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Onboarding Dark Theme"
)
@Composable
fun PreviewOnboardingScreen() {
    ComposePathwayTheme {
        OnboardingScreen {}
    }
}