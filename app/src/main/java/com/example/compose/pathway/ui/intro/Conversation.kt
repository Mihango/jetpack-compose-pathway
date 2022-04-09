package com.example.compose.pathway.ui.intro

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.pathway.data.Message
import com.example.compose.pathway.data.SampleData
import com.example.compose.pathway.ui.theme.ComposePathwayTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(msg = message)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConversation() {
    ComposePathwayTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}