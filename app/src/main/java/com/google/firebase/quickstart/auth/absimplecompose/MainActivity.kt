package com.google.firebase.quickstart.auth.absimplecompose

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.quickstart.auth.absimplecompose.ui.theme.AbSimpleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbLayout()

        }
    }
}
@Composable
fun AbRowArrangement(){
    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement  =  Arrangement.SpaceEvenly) {
        Text(text = " Text 1",modifier = Modifier.background(color = Color.Green))
        Text(text = " Text 2", modifier = Modifier.background(color = Color.Yellow))
        Text(text = " Text 3",modifier = Modifier.background(color = Color.Red))
    }
}

@Composable
fun AbColumnArrangement(){
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment  =  Alignment.CenterHorizontally
    ) {
        Text(text = " Text 1",
            Modifier
                .background(Color.Green)
                .fillMaxWidth())
        Text(text = " Text 2",
            Modifier
                .background(Color.Yellow)
                .fillMaxWidth())
        Text(text = " Text 3",
            Modifier
                .background(Color.Red)
                .fillMaxWidth())
    }
}
@Composable
fun MaxLines() {
    Text("hello ".repeat(50))
}

@Composable
fun AbLayout()
{
    Column {

        AbRowArrangement()
        MaxLines()
        AbColumnArrangement()
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LayoutPreviw()
{
    AbLayout()
}