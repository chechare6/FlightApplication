package com.example.flightapplication.data.dao

import androidx.room.Entity

@Entity(tableName = "airport")
data class Flight(
    val id: Int = 0,
    val departureCode: String ="",
    val departureName: String="",
    val destinationCode: String="",
    val destinationName: String="",
    val isFavorite: Boolean=false
)