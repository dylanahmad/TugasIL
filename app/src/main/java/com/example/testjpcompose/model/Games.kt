package com.example.testjpcompose.model

data class Games(
    val id: Int,
    val title: String,
    val genres: String,
    val description : String,
    val gameImageId: Int = 0

)
