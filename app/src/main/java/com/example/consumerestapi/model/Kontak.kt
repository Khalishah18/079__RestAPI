package com.example.consumerestapi.model

import kotlinx.serialization.SerialName

data class Kontak(
    val id: Int,
    val nama: String,
    @SerialName(value = "email")
    val email: String,
    @SerialName(value = "telpon")
    val nohp: String
)
