package com.example.newsappjetpack.homeview

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.newsappjetpack.ui.theme.black
import com.example.newsappjetpack.ui.theme.white

@Composable
fun AllNewsView() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(white)
                .padding(10.dp)
        )
        {
            Text(
                text = "KCAU News",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start
                ),
                modifier = Modifier.padding(start = 10.dp, top = 30.dp, bottom = 20.dp)
            )
            // Navigation Items
            LazyRow (
                modifier = Modifier.padding(start = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                item {
                    Text(
                        text = "All News",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Business",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Politics",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Tech",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Socialization",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Games",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
                item {
                    Text(
                        text = "Fashion",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
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

                                    )
                            }
                            Text(
                                text = "Citizen rally to protect natural area in the world",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                color = white,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 100.dp, end = 5.dp, bottom = 10.dp)
                            )
                        }
                    }
                }
                // Next Banner
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

                                    )
                            }
                            Text(
                                text = "Online classes launched by head of department on 4th February 2023",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                color = white,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 100.dp, end = 5.dp, bottom = 10.dp)
                            )
                        }
                    }
                }
                // Next Banner
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

                                    )
                            }
                            Text(
                                text = "School of Technology student awarded $ 100,000 for innovation",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                color = white,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 100.dp, end = 5.dp, bottom = 10.dp)
                            )
                        }
                    }
                }
            }
            // Latest News
            Text(
                text = "Latest News",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Start
                ),
                modifier = Modifier.padding(start = 10.dp, top = 30.dp, bottom = 20.dp)
            )
            LazyColumn {
                item {
                    Card {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fashion) ,
                                contentDescription = "news image",
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                                    .padding(start = 10.dp)
                                    .clip(RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.FillHeight

                            )
                            // Article items
                            Column {
                                Text(
                                    text = "Animation get boost from Southampton tree vandals",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 5.dp, top = 10.dp, bottom = 30.dp)
                                )
                                Row (
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .fillMaxWidth()
                                    ,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                        ) {
                                    Text(
                                        text = "1 hour ago",
                                        fontWeight = FontWeight.Normal,
                                        color = black
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.bookmark_border),
                                        contentDescription = "bookmark",
                                        modifier = Modifier.padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    Card {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.games) ,
                                contentDescription = "news image",
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                                    .padding(start = 10.dp)
                                    .clip(RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.FillHeight

                            )
                            // Article items
                            Column {
                                Text(
                                    text = "Team rugby clash with last year's champions",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 5.dp, top = 10.dp, bottom = 30.dp)
                                )
                                Row (
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .fillMaxWidth()
                                    ,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = "4 hours ago",
                                        fontWeight = FontWeight.Normal,
                                        color = black
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.bookmark_border),
                                        contentDescription = "bookmark",
                                        modifier = Modifier.padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    Card {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.forest) ,
                                contentDescription = "news image",
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                                    .padding(start = 10.dp)
                                    .clip(RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.FillHeight

                            )
                            // Article items
                            Column {
                                Text(
                                    text = "The environment club plants 1 million trees",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 5.dp, top = 10.dp, bottom = 30.dp)
                                )
                                Row (
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .fillMaxWidth()
                                    ,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = "10 hours ago",
                                        fontWeight = FontWeight.Normal,
                                        color = black
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.bookmark_border),
                                        contentDescription = "bookmark",
                                        modifier = Modifier.padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    Card {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.kcau_logo) ,
                                contentDescription = "news image",
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                                    .padding(start = 10.dp)
                                    .clip(RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.FillHeight

                            )
                            // Article items
                            Column {
                                Text(
                                    text = "University heads launch real-time learning platform",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 5.dp, top = 10.dp, bottom = 30.dp)
                                )
                                Row (
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .fillMaxWidth()
                                    ,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = "20 hours ago",
                                        fontWeight = FontWeight.Normal,
                                        color = black
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.bookmark_border),
                                        contentDescription = "bookmark",
                                        modifier = Modifier.padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    Card {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fashion) ,
                                contentDescription = "news image",
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                                    .padding(start = 10.dp)
                                    .clip(RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.FillHeight

                            )
                            // Article items
                            Column {
                                Text(
                                    text = "Fashion week: Hundred os students rule the runway",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 5.dp, top = 10.dp, bottom = 30.dp)
                                )
                                Row (
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .fillMaxWidth()
                                    ,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = "23 hours ago",
                                        fontWeight = FontWeight.Normal,
                                        color = black
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.bookmark_border),
                                        contentDescription = "bookmark",
                                        modifier = Modifier.padding(end = 10.dp)
                                    )
                                }
                            }
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