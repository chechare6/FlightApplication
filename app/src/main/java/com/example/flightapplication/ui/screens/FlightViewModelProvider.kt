package com.example.flightapplication.ui.screens

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.flightapplication.FlightApplication

object FlightViewModelProvider  {
    val Factory = viewModelFactory {
        initializer {
            FlightViewModel(
                flightApplication().container.flightRepository,
                flightApplication().userPreferencesRepository
            )
        }
    }
}

fun CreationExtras.flightApplication(): FlightApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as FlightApplication)