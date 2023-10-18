package com.example.projectkartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectkartunama.ui.theme.ProjectKartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectKartuNamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFd2e8d4)
                ) {
                    ProjectKartuNamaPreview()
                }
            }
        }
    }
}

@Composable
fun Profil(modifier : Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 120.dp)
    ) {
        Box(
            modifier = Modifier.background(Color(0xFF073042))
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.size(120.dp)
            )
        }
        Text(
            text = "Annisa Raulita Arjul",
            fontSize = 28.sp,
            modifier = Modifier.padding(top = 10.dp)
        )
        Text(
            text = "Informatics Student",
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF006833),
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun Kontak(modifier : Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(top = 200.dp, bottom = 40.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier.padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(
                text = "0852 1395 0991",
                modifier = Modifier.padding(start = 14.dp)
            )
        }

        Row(
            modifier = Modifier.padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(
                text = "@Annisaraulitaa",
                modifier = Modifier.padding(start = 14.dp)
            )
        }

        Row(
            modifier = Modifier.padding(5.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text (
                text = "annisaraulita240702@gmail.com",
                modifier = Modifier.padding(start = 14.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProjectKartuNamaPreview() {
    ProjectKartuNamaTheme {
        Column(
            modifier = Modifier
                .padding(top = 100.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
        ) {
            Profil()
            Kontak()
        }
    }
}
