package com.example.composequadranapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadranapp.ui.theme.ComposeQuadranAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadranAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column (Modifier.fillMaxWidth()) {
        Row (Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.first_title),
                desc = stringResource(R.string.first_desc),
                bgColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(0.5f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.second_title),
                desc = stringResource(R.string.second_desc),
                bgColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(0.5f)
            )
        }
        Row (Modifier.weight(1f))  {
            ComposableInfoCard(
                title = stringResource(R.string.third_title),
                desc = stringResource(R.string.third_desc),
                bgColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(0.5f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.fourth_title),
                desc = stringResource(R.string.fourth_desc),
                bgColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(0.5f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    desc: String,
    bgColor: Color,
    modifier: Modifier = Modifier
) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(bgColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadranAppPreview() {
    ComposeQuadranAppTheme {
        ComposeQuadrantApp()
    }
}