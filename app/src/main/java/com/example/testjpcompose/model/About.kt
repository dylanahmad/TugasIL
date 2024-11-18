package com.example.testjpcompose.model

data class About(
    val id: Int,
    val nama: String,
    val email: String,
    val jurusan : String,
    val kampus: String,
    val gameImageId: Int = 0

)
