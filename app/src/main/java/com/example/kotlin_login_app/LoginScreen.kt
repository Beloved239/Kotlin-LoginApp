package com.example.kotlin_login_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.login), contentDescription = "login image",
            modifier = Modifier.size(280.dp))
        Text(text = "Welcome back", fontSize = 20.sp, fontWeight = FontWeight.Bold ,color = Color.Blue)

        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Login to your account")
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email address")
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password")
        })

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {  }) {
            Text(text = "Login")

        }
    }



}



