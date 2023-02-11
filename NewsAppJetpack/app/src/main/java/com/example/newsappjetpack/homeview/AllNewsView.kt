package com.example.newsappjetpack.homeview

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsappjetpack.R
import com.example.newsappjetpack.ui.theme.white

@Composable
fun AllNewsView() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(white)
        )
        {
            Text(
                text = "KCAU News",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Start
                )
            )
            // Navigation Items
            LazyRow {
                item {
                    Text(
                        text = "All News",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Business",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Politics",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Tech",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Socialization",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Games",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Fashion",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
            }
            // News Banner - Large
            LazyRow {
                item {
                    Card(
                        modifier = Modifier
                            .padding(5.dp)
                            .clip(RoundedCornerShape(8.dp))
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.forest),
                            contentDescription = "banner image",
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth()
                                .height(300.dp),
                            contentScale = ContentScale.FillBounds

                        )
                        Column {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(5.dp)
                                ,
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Text(
                                    text = "3 hours ago",
                                    style = TextStyle(
                                        fontWeight = FontWeight.SemiBold,
                                        color = white,
                                        fontSize = 14.sp
                                    )
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.bookmark_border),
                                    contentDescription = "favorite",
                                    modifier = Modifier.clip(RoundedCornerShape(8.dp))

                                )
                            }
                            Text(
                                text = "Citizen rally to protect natural area in the world",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold,
                                color = white,
                                modifier = Modifier.padding(top = 250.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewAllNewsView() {
    AllNewsView()
}