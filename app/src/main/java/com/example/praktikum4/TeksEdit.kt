package com.example.praktikum4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier
){
    //variable" untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableMapOf("")}
    var textAlamat by remember {mutableMapOf("")}
    var textJK by remember {mutableMapOf("")}

    //variable" untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember {mutableMapOf("")}
    var alamat by remember {mutableMapOf("")}
    var jenis by remember {mutableMapOf("")}
}