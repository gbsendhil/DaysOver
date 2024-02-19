package com.sendhil.daysover

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sendhil.daysover.ui.theme.DaysOverTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaysOverTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        DaysOver()
                        SubText()
                    }
                }
            }
        }
    }
}

@Composable
fun DaysOver(modifier: Modifier = Modifier, mainActivityViewModel: MainActivityViewModel = viewModel()) {
    Text(
        text = "${mainActivityViewModel.generateDaysSinceStartOfYear()} days",
        modifier = modifier,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun SubText(modifier: Modifier = Modifier) {
    Text(
        text = "since start of the year",
        modifier = modifier,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DaysOverTheme {
        DaysOver()
    }
}