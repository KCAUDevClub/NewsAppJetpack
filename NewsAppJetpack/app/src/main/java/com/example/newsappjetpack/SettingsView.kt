package com.example.newsappjetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsappjetpack.ui.theme.brickred

@Composable
fun SettingsView() {
    // Title
    // Image
    // Overview
    // Email
    // Sign Out
    // SECTIONS
    // Dark Mode
    // Notifications
    // ACCOUNT
    // PRIVACY AND SECURITY
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Settings",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.user_img),
                    contentDescription = "user image",
                    modifier = Modifier
                        .clip(CircleShape)
                        .height(150.dp)
                        .width(150.dp)
                        .padding(all = 10.dp)
                )
                Column {
                    Text(
                        text = "Michael Faraday",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "michaelfaraday@hotmail.com",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    ClickableText(
                        text = AnnotatedString(
                            "Sign Out"
                        ),
                        style = TextStyle(
                            color = brickred,
                            fontWeight = FontWeight.Bold
                        ),
                        onClick = {}
                    )
                }
            }
            // Card - Dark Mode + Notifications


            // Card - Edit, change password, language
            Text(
                text = "Account",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )


            // Card - Privacy Account Privacy and Security Help
            Text(
                text = "Privacy and Security",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettingsView() {
    SettingsView()
}