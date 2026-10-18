package com.herstudy.ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Purple = Color(0xFF7C4DFF)
private val LightPurple = Color(0xFFEDE7FF)
private val DeepPurple = Color(0xFF4527A0)
private val SoftBackground = Color(0xFFFAF8FF)

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)

    setContent {
        MaterialTheme(
            colorScheme = lightColorScheme(
                primary = Purple,
                secondary = DeepPurple,
                background = SoftBackground,
                surface = Color.White
            )
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = SoftBackground
            ) {
                HomeScreen()
            }
        }
    }
}

}

@Composable
fun HomeScreen() {
Column(
modifier = Modifier
.fillMaxSize()
.verticalScroll(rememberScrollState())
.padding(20.dp),
verticalArrangement = Arrangement.spacedBy(16.dp)
) {
Row(
modifier = Modifier.fillMaxWidth(),
verticalAlignment = Alignment.CenterVertically,
horizontalArrangement = Arrangement.SpaceBetween
) {
Column {
Text(
text = "HerStudy AI 💜",
fontSize = 26.sp,
fontWeight = FontWeight.Bold,
color = DeepPurple
)
Text(
text = "Your personal study companion",
fontSize = 13.sp,
color = Color.Gray
)
}

        Text(text = "🌷", fontSize = 34.sp)
    }

    Spacer(modifier = Modifier.height(4.dp))

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Purple)
    ) {
        Column(
            modifier = Modifier.padding(22.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Hello, Beautiful! ✨",
                color = Color.White,
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Every page you study brings you closer to your dreams. You can do this! 💜",
                color = Color.White,
                fontSize = 15.sp,
                lineHeight = 22.sp
            )
        }
    }

    Text(
        text = "Your Study Tools",
        fontSize = 21.sp,
        fontWeight = FontWeight.Bold,
        color = DeepPurple
    )

    StudyCard(
        emoji = "📸",
        title = "AI Reviewer Maker",
        description = "Turn scanned pages and documents into study materials."
    )

    StudyCard(
        emoji = "🤖",
        title = "Offline AI Companion",
        description = "Ask questions and get help understanding your lessons."
    )

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        StudyCard(
            emoji = "📚",
            title = "My Reviewers",
            description = "Your saved study notes.",
            modifier = Modifier.weight(1f)
        )

        StudyCard(
            emoji = "🧠",
            title = "Flashcards",
            description = "Practice and remember.",
            modifier = Modifier.weight(1f)
        )
    }

    StudyCard(
        emoji = "✍️",
        title = "Practice Quiz",
        description = "Test what you've learned and review your answers."
    )

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = LightPurple)
    ) {
        Column(
            modifier = Modifier.padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(
                text = "A little reminder 💌",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                color = DeepPurple
            )
            Text(
                text = "Believe in yourself. I'm cheering for you, always. 💜",
                color = DeepPurple,
                fontSize = 14.sp
            )
        }
    }

    Text(
        text = "Made with love, just for you 💜",
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        color = DeepPurple,
        fontSize = 13.sp
    )
}

}

@Composable
fun StudyCard(
emoji: String,
title: String,
description: String,
modifier: Modifier = Modifier
) {
Card(
modifier = modifier.fillMaxWidth(),
shape = RoundedCornerShape(20.dp),
colors = CardDefaults.cardColors(containerColor = Color.White),
elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
) {
Row(
modifier = Modifier.padding(16.dp),
verticalAlignment = Alignment.CenterVertically,
horizontalArrangement = Arrangement.spacedBy(14.dp)
) {
Surface(
modifier = Modifier.size(50.dp),
shape = RoundedCornerShape(16.dp),
color = LightPurple
) {
androidx.compose.foundation.layout.Box(
contentAlignment = Alignment.Center
) {
Text(text = emoji, fontSize = 25.sp)
}
}

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = DeepPurple
            )
            Text(
                text = description,
                fontSize = 13.sp,
                color = Color.DarkGray,
                lineHeight = 18.sp
            )
        }
    }
}

}
