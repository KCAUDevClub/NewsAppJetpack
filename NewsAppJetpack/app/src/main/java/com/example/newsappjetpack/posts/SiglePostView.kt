package com.example.newsappjetpack.posts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsappjetpack.R
import com.example.newsappjetpack.ui.theme.black
import com.example.newsappjetpack.ui.theme.white

@Composable
fun SinglePostView() {
    MaterialTheme {
        LazyColumn {
            item {
                Card(
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .width(380.dp)
                        .height(260.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.forest),
                        contentDescription = "banner image",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                            .height(240.dp)
                            .clip(RoundedCornerShape(12.dp)),
                        contentScale = ContentScale.FillBounds

                    )
                    Column {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.arrow_back),
                                contentDescription = "back arrow",

                                )
                            Image(
                                painter = painterResource(id = R.drawable.bookmark_border),
                                contentDescription = "favorite",

                                )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "2 hours ago",
                                style = TextStyle(
                                    fontWeight = FontWeight.SemiBold,
                                    color = white,
                                    fontSize = 14.sp
                                )
                            )
                            Image(
                                painter = painterResource(id = R.drawable.visibility_off),
                                contentDescription = "visibility",

                                )
                        }
                    }
                }
            }
            // Next Item - Post Title
            item {
                Text(
                    text = "Importance of settings dashboard in mobile apps",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = black,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 20.dp, end = 5.dp, bottom = 10.dp)
                )
            }
            // Next Item - Post Paragraphs
            item {
                Text(
                    text = "Well-designed settings panels allow users to tailor apps to their needs and help companies lower customer-support costs. App settings help users manage items such as push notifications, time zones, and login credentials.",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = black,
                    modifier = Modifier
                        .padding(20.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSinglePostView() {
    SinglePostView()
}