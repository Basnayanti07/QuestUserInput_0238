package com.example.act5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormatDataDiri(modifier: Modifier){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama = remember {mutableStateOf( value = "")}
    var textAlamat = remember { mutableStateOf( value = "")}
    var textJK = remember { mutableStateOf( value = "") }
    val gender:List<String> = listOf("Laki-laki", "Perempuan")

    //variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama = remember { mutableStateOf( value = "") }
    var alamat = remember { mutableStateOf( value = "") }
    var jenis = remember { mutableStateOf( value = "") }

}