package com.example.flightapplication.data.dao

import com.example.flightapplication.model.Favorite
import com.example.flightapplication.model.IataAndName
import kotlinx.coroutines.flow.Flow

class OfflineFlightRepository(private val flightDao: FlightDao) : FlightRepository{
    override fun getAutocompleteSuggestions(input: String): Flow<List<IataAndName>> =
        flightDao.retrieveAutocompleteSuggestions(input)

    override fun getPossibleFlights(name: String, iataCode: String): Flow<List<IataAndName>> =
        flightDao.retrievePossibleFlights(name, iataCode)

    override suspend fun insertFavoriteItem(favorite: Favorite) =
        flightDao.insertFavorite(favorite)

    override suspend fun deleteFavorite(departureCode: String, destinationCode: String) =
        flightDao.deleteFavorite(departureCode, destinationCode)

    override suspend fun deleteAllFavorites() = flightDao.deleteAllFavorites()

    override fun getAllFavorites(): Flow<List<Favorite>> =
        flightDao.retrieveAllFavorites()

}