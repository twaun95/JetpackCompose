package com.twaun95.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.twaun95.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    GreetingCol("Android")
                    GreetingRow("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun GreetingCol(name: String) {
    Column {
        Text(text = "Col Hello $name!")
        Text(text = "Col Hello2 $name!")
    }
}

@Composable
fun GreetingRow(name: String) {
    Row(modifier = Modifier.padding(all = 10.dp)) {
        Text(text = "Row Hello $name!")
        Spacer(modifier = Modifier.size(30.dp))
        Text(text = "Row Hello2 $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
//        GreetingCol("Android")
        GreetingRow(name = "AndroidRow")
    }
}