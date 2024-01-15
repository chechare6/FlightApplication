package com.example.flightapplication

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.core.Preferences
import com.example.flightapplication.data.dao.AppContainer
import com.example.flightapplication.data.dao.AppDataContainer
import com.example.flightapplication.data.dao.UserPreferencesRepository

private const val USER_INPUT = "user_input"
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = USER_INPUT
)
class FlightApplication : Application() {

    lateinit var container: AppContainer
    lateinit var userPreferencesRepository: UserPreferencesRepository

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
        userPreferencesRepository = UserPreferencesRepository(dataStore)
    }
}