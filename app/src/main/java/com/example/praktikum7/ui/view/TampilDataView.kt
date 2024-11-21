package com.example.praktikum7.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikum7.model.DataSiswa

@Composable
fun TampilDataView(
    uiState: DataSiswa, onBackButton: () -> Unit
) {
    Column (
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Tampildata(param = "nama", argum = uiState.nama)
        Tampildata(param = "email", argum = uiState.alamat)
        Tampildata(param = "alamat", argum = uiState.telpon)
        Button(onClick = onBackButton) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun Tampildata(param: String, argum:String){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            //horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = argum, modifier = Modifier.weight(2f))
        }
    }
}