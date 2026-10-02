package com.example.actividad3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad3.ui.theme.Actividad3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

           Columna()
        }
    }
}

@Composable
fun Columna(){
    Column(
        modifier = Modifier.fillMaxSize() .fillMaxWidth(),

        verticalArrangement = Arrangement.Center

    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
            ) {
            Text(
                text = "GASTOS",
                fontSize = 60.sp,

            )
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
            ) {
            Text(
                text = "Dpto. Informática",
                fontSize = 40.sp
            )
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
            ) {
            Column() {
                Text(text = "Nombre", fontSize = 18.sp)
                Text(text = "Teclados", fontSize = 14.sp)

            }
            Column() {
                Text(text = "Precio", fontSize = 18.sp)
                Text(text = "12,99€", fontSize = 14.sp)

            }
            Column() {
                Text(text = "Cantidad", fontSize = 18.sp)
                Text(text = "24", fontSize = 14.sp )

            }
            Column() {
                Text(text = "Precio total", fontSize = 18.sp)
                Text(text = "311.76", fontSize = 14.sp)

            }

        }



    }
}