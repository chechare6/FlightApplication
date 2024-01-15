package com.example.flightapplication.ui.screens

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.flightapplication.FlightApplication

object FlightViewModelProvider {
    val Factory: ViewModelProvider.Factory = viewModelFactory {
        initializer {
            val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as FlightApplication)

            val flightRepository = application.container.flightRepository
            val preferencesRepository = application.userPreferencesRepository

            FlightViewModel(
                flightRepository = flightRepository,
                userPreferencesRepository = preferencesRepository
            )
        }
    }
}