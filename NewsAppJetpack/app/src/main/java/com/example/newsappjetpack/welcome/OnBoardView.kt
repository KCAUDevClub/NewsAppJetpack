package com.example.newsappjetpack.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsappjetpack.R

@Composable
fun OnBoardView() {
    Column(
        modifier = Modifier
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        Color.Red, Color.Black
                    )
                )
            )
            .clip(RoundedCornerShape(8.dp))
            .fillMaxSize()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 80.dp, topEnd = 80.dp))
                    .fillMaxSize()
                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(
                                Color.Red, Color.Black
                            )
                        )
                    )
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.kcau_logo) ,
                    contentDescription = "logo",
                    modifier = Modifier
                        .height(120.dp)
                        .clip(RoundedCornerShape(12.dp))
                )
                Text(
                    text = "KCAU News App",
                    style = TextStyle(
                        color = Color.White,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold,
                        fontSize = 40.sp,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
                Spacer(modifier = Modifier.height(120.dp))

                // Welcome Back
                Text(
                    text = "Welcome Back",
                    style = TextStyle(
                        color = Color.White,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold,
                        fontSize = 40.sp,
                    )
                )

                // Sign In Button
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .width(240.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .border(2.dp, color = Color.White)
                    ,
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = "SIGN IN",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            color = Color.White
                        )
                    )
                }
                // Sign Up Button
                Spacer(modifier = Modifier.height(26.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White
                    ),
                    modifier = Modifier
                        .width(240.dp)
                        .clip(RoundedCornerShape(36.dp)),
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = "SIGN UP",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            color = Color.Black
                        )
                    )
                }
//                Don't have an account CTA
                Spacer(modifier = Modifier.height(100.dp))
                Text(
                    text = "Login with Social Media",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White
                    ),
                    modifier = Modifier.padding(top = 10.dp)
                )
                // Social Media Icons
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "instagram",
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                            .padding(start = 5.dp)
                            .background(color = Color.White)
                            .clip(RoundedCornerShape(12.dp))

                    )
                    Icon(
                        painter = painterResource(id = R.drawable.instaicon),
                        contentDescription = "instagram",
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                            .padding(start = 5.dp)
                            .background(color = Color.White)
                            .clip(CircleShape)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.twittericon),
                        contentDescription = "twitter",
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                            .padding(start = 5.dp)
                            .background(color = Color.White)
                            .clip(CircleShape)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.facebookicon),
                        contentDescription = "facebook",
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                            .padding(start = 5.dp)
                            .border(2.dp, Color.White)
                            .clip(CircleShape)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewOnboard() {
    OnBoardView()
}