package com.example.flightapplication.data.dao

import com.example.flightapplication.model.Airport
import com.example.flightapplication.model.Favorite
import com.example.flightapplication.model.IataAndName
import kotlinx.coroutines.flow.Flow

class OfflineFlightRepository(private val airportDao: FlightDao) : FlightRepository{
    override fun getAutocompleteSuggestions(input: String): Flow<List<IataAndName>> {
        flightDao.retrieveAutoC
    }

    override fun getPossibleFlights(name: String, iataCode: String): Flow<List<IataAndName>> {
        TODO("Not yet implemented")
    }

    override suspend fun insertFavoriteItem(favorite: Favorite) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteFavorite(departureCode: String, destinationCode: String) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllFavorites() {
        TODO("Not yet implemented")
    }

    override fun getAllFavorites(): Flow<List<Favorite>> {
        TODO("Not yet implemented")
    }

}