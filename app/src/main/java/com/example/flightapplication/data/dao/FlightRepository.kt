package com.example.flightapplication.data.dao

import com.example.flightapplication.model.Favorite
import com.example.flightapplication.model.IataAndName
import kotlinx.coroutines.flow.Flow


interface FlightRepository {
   fun getAutocompleteSuggestions(input: String): Flow<List<IataAndName>>
   fun getPossibleFlights(name: String, iataCode: String): Flow<List<IataAndName>>
   suspend fun insertFavoriteItem(favorite: Favorite)
   suspend fun deleteFavorite(departureCode: String, destinationCode: String)
   suspend fun deleteAllFavorites()
   fun getAllFavorites(): Flow<List<Favorite>>
}