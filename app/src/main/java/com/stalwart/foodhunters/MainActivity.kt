package com.stalwart.foodhunters

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFF2F2F2))
                    .fillMaxSize()
                    .verticalScroll(scrollState)
            ) {
                val image = painterResource(id = R.drawable.happy_meal_small)
                Image(
                    painter = image,
                    contentDescription = "",
                    modifier = Modifier.height(250.dp),
                    contentScale = ContentScale.Crop
                )

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Happy Meal",
                        style = TextStyle(
                            fontSize = 26.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))

                    Text(
                        text = "800 Calories",
                        style = TextStyle(
                            fontSize = 20.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))

                    Text(
                        text = "$5.99",
                        style = TextStyle(
                            fontSize = 18.sp,
                            color = Color.LightGray
                        )
                    )
                }
            }
        }
    }
}