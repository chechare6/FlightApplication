package com.example.flightapplication.data.dao

import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.*
import java.io.IOException

class UserPreferencesRepository(private val dataStore: DataStore<Preferences>) {
    private companion object {
        val USER_INPUT = stringPreferencesKey("user_input")
        const val TAG = "UserPreferencesRepo"
    }
    suspend fun saveUserInput(
        searchValue: String
    ) {
        dataStore.edit { preferences ->
            preferences[USER_INPUT] = searchValue
        }
    }

    val userInput: Flow<String> = dataStore.data
        .catch {
            if(it is IOException) {
                Log.e(TAG, "Error on Preferences.", it)
                emit(emptyPreferences())
            } else {
                throw it
            }
        }
        .map { preferences ->
            preferences[USER_INPUT] ?: ""
        }
}