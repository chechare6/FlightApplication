package com.example.flightapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "airport")
data class Airport(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo("iata_code")
    val code: String,

    @ColumnInfo("name")
    val name: String,

    @ColumnInfo("passengers")
    val passengers: Int
)

data class IataAndName(
    @ColumnInfo(name = "iata_code")
    val iataCode: String,
    @ColumnInfo(name = "name")
    val name: String
)