package com.example.prototype.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prototype.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    val ColorScheme = darkColorScheme(
        primary = Color(0xFFE8D405),
        onPrimary = Color(0xFF8E08A6),
        onSurface = Color(0xFF2A4F02)
    )

    MaterialTheme(
        colorScheme = ColorScheme
    ){

        // Scaffold genera una pantalla basica
        Scaffold(
            topBar = {
                TopAppBar(title = { Text("PR0T0T1PO",
                                    color = MaterialTheme.colorScheme.onPrimary) })
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
                                   .fillMaxSize()
                                   .padding(16.dp)
                                   .background(Color(0xFF101010)),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "B13NV3N1D0 N3TRUNN3R",
                     style = MaterialTheme.typography.headlineMedium,
                     color = MaterialTheme.colorScheme.primary)

                Spacer(modifier = Modifier.height(20.dp))

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo App",
                    modifier = Modifier.fillMaxWidth()
                                       .height(150.dp),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(20.dp))

                Button(onClick = {/* futura accion*/}) {
                    Text("CL1CK 4QU1")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}