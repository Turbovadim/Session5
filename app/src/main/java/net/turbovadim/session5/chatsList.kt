package net.turbovadim.session5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import net.turbovadim.session5.ui.theme.jost
import net.turbovadim.session5.ui.theme.jostbold
import net.turbovadim.session5.ui.theme.jostregular

@Composable
fun ChatsList(navController: NavController) {

    Column(
        modifier = Modifier
            .padding(horizontal = 18.dp)
            .padding(top = 22.dp),
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Спрашивай обо всём !",
                fontFamily = jostbold,
                fontSize = 24.sp
            )
            Box(
                modifier = Modifier
                    .width(45.dp)
                    .height(45.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFEC000)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Т",
                    fontFamily = jost,
                    fontSize = 22.sp,
                    color = Color.White
                )
            }
        }
        Text(
            text = "Задавайте любые вопросы нашим менторам через чат и получите ответ в течении 12 часов !",
            fontSize = 14.sp,
            fontFamily = jostregular,
            modifier = Modifier
                .padding(top = 16.dp)
                .width(270.dp)
        )
    }
    LazyColumn() {

    }

}