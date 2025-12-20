package com.example.codemonth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codemonth.model.CodingDays
import com.example.codemonth.ui.theme._30DaysOfCodingTheme
import com.example.codemonth.data.DataSource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysOfCodingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ){
                    CodeApp()
                }
            }
        }
    }
}

@Composable
fun CodeApp(){
    Scaffold(
        topBar = {
            CodeTopBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(DataSource().loadCodingDays()){
                DayItem(codingDays = it)
            }
        }
    }
}

@Composable
fun CodeTopBar(modifier: Modifier = Modifier){

}

@Composable
fun DayItem(codingDays: CodingDays){
    var tapped by remember { mutableStateOf(false) }
    Card(
          modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .clickable { tapped = !tapped },
          elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp,
                pressedElevation = 8.dp
          ),
          colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
        )
        ){
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
        ){
            Text(
                text = "Day ${codingDays.dayCount}",
                style = MaterialTheme.typography.bodySmall,
            )
            Text(
                text = stringResource(codingDays.topicRes),
                style = MaterialTheme.typography.displaySmall
            )
            Image(
                painter = painterResource(codingDays.imageRes),
                contentDescription = stringResource(codingDays.topicRes),
                modifier = Modifier
                    .padding(all = 20.dp)
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            if(tapped){
                DayDescription(codingDays.descriptionRes,
                        modifier = Modifier
                            .padding(start = 16.dp, top = 8.dp, bottom = 16.dp, end = 16.dp)
                    )
            }
        }
    }
}

@Composable
fun DayDescription(
    @StringRes descriptionResource: Int,
    modifier: Modifier = Modifier
){
    Card(){
        Text(
            text = stringResource(descriptionResource),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _30DaysOfCodingTheme {
//        CodeApp()
        DayItem(codingDays = CodingDays(1, R.string.day1topic, R.drawable.image1, R.string.day1Desc))
    }
}