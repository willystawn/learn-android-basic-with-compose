package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray)
    ) {
        ComposedContactInformation(
            name = stringResource(R.string.name),
            title = stringResource(R.string.title)
        )
    }
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 500.dp)
            .padding(bottom = 70.dp)
    ) {
        ComposedContactSochmed()
    }
}

@Composable
private fun ComposedContactInformation(
    name: String,
    title: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.android_logo)

    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .height(150.dp)
            .width(150.dp)
    )
    Text(
        text = name,
        color = Color.White,
        fontSize = 30.sp,
        modifier = Modifier.padding(bottom = 10.dp)
    )
    Text(
        text = title,
        color = Color(0xFF3ddc84)
    )
}

@Composable
private fun ComposedContactSochmed(
    modifier: Modifier = Modifier
) {
    Column(horizontalAlignment = Alignment.Start) {
        Row(
            modifier = Modifier.padding(bottom = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = stringResource(R.string.phone_number),
                modifier = Modifier.padding(start = 25.dp),
                color = Color.White
            )
        }
        Row(
            modifier = Modifier.padding(bottom = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = stringResource(R.string.email),
                modifier = Modifier.padding(start = 25.dp),
                color = Color.White
            )
        }
        Row(
            modifier = Modifier.padding(bottom = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF3DDC84),
            )
            Text(
                text = stringResource(R.string.url_website),
                modifier = Modifier.padding(start = 25.dp),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}