package com.example.newsappjetpack.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsappjetpack.R

@Composable
fun SignUpView() {
    Column(
        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)
                .height(200.dp)
        ) {
            Text(
                text = "Hello \nSign in!",
                style = TextStyle(
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                ),
                modifier = Modifier
                    .padding(start = 20.dp, top = 50.dp)
            )
        }
//    Next Box
        Box(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 100.dp, topEnd = 100.dp))
                    .fillMaxSize()
                    .background(color = Color.White)
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    value = "Enter email address",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Gmail",
                            color = Color.Red,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                    },
                    trailingIcon = {
                        IconButton(
                            onClick = { /*TODO*/ }

                        ) {}
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "Check Mark"
                        )
                    }

                )
//            Password section
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "Enter Password",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Password",
                            color = Color.Red,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                    },
                    trailingIcon = {
                        IconButton(
                            onClick = { /*TODO*/ }

                        ) {}
                        Icon(
                            painter = painterResource(id = R.drawable.visibility_off),
                            contentDescription = ""
                        )
                    }
                )
//            Forgot Password section
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Forgot Password",
                    modifier = Modifier.align(Alignment.End),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
//            Sign In Button
                Spacer(modifier = Modifier.height(100.dp))
                Button(modifier = Modifier
                    .background(color = Color.Red),
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = "Sign In",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            color = Color.White
                        )
                    )
                }
//                Don't have an account CTA
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Don't have an account?",
                    modifier = Modifier.align(Alignment.End),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                )
                ClickableText(
                    text = AnnotatedString(
                        "Sign up"
                    ),
                    onClick = {
                        // TODO Navigation to Sign Up Screen
                    },
                    modifier = Modifier.align(Alignment.End),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                )
            }
        }

    }
}


@Preview
@Composable
fun PreviewSignUp() {
    SignInView()
}