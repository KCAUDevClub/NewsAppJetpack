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
                text = "Create Your\nAccount",
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
                    .clip(RoundedCornerShape(topStart = 80.dp, topEnd = 80.dp))
                    .fillMaxSize()
                    .background(color = Color.White)
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                // Full name
                OutlinedTextField(
                    modifier = Modifier.padding(top = 50.dp),
                    value = "Enter Name",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Full Name",
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
                // Phone or Gmail
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "Enter phone or email address",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Phone or Gmail",
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

                // Confirm Password
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "Re-Enter Password",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Confirm Password",
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

//            Sign Up Button
                Spacer(modifier = Modifier.height(40.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Red
                    ),
                    modifier = Modifier
                        .width(240.dp)
                        .clip(RoundedCornerShape(36.dp))
                ) {
                    Text(
                        text = "SIGN UP",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            color = Color.White
                        )
                    )
                }
//                Don't have an account CTA
                Spacer(modifier = Modifier.height(60.dp))
                Text(
                    text = "Already have an account?",
                    modifier = Modifier.align(Alignment.End),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                )
                ClickableText(
                    text = AnnotatedString(
                        "Sign In"
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
    SignUpView()
}