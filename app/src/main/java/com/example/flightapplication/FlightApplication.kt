package com.example.flightapplication

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import java.util.prefs.Preferences

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