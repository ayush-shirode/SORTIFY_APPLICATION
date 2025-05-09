package com.example.asepapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape

@Composable
fun mainApp() {
    Column {
        Column(modifier = Modifier.fillMaxWidth().background(Color(0xFFBDB96A)).padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "SORTIFY", fontFamily = FontFamily.Serif, fontWeight = FontWeight.ExtraBold, fontSize = 45.sp, color = Color(0xFFCF6DFC))
            Text(text = "Intelligent Dry Waste Sorting Powered by AI and IOT", fontSize = 12.sp, fontFamily = FontFamily.Serif)
        }
        Column(modifier = Modifier.fillMaxSize().padding(16.dp).verticalScroll(rememberScrollState())) {
            Box(modifier = Modifier.background(Color(0xFFC1BFFF)).padding(8.dp).border(width = 2.dp, color = Color.Black, shape = RectangleShape)
                .clickable {}) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.recycling_quiz),
                        contentDescription = "Quiz",
                        modifier = Modifier.aspectRatio(2f)
                    )
                    Text(text = "QUIZ: Let's Test your Knowledge", modifier = Modifier.padding(16.dp))
                }
            }
            Box(modifier = Modifier.background(Color(0xFFC1BFFF)).padding(8.dp).border(width = 2.dp, color = Color.Black, shape = RectangleShape)
                .clickable {}) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.challenges_mission),
                        contentDescription = "Quiz",
                        modifier = Modifier.aspectRatio(2f)
                    )
                    Text(text = "Challenges and Mission", modifier = Modifier.padding(16.dp))
                }
            }
            Box(modifier = Modifier.background(Color(0xFFC1BFFF)).padding(8.dp).border(width = 2.dp, color = Color.Black, shape = RectangleShape)
                .clickable {}) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.recycling_quiz),
                        contentDescription = "Quiz",
                        modifier = Modifier.aspectRatio(2f)
                    )
                    Text(text = "Events", modifier = Modifier.padding(16.dp))
                }
            }
            Spacer(modifier = Modifier.fillMaxWidth().padding(22.dp))
        }
    }
}