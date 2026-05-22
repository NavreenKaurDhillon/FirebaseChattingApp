package com.example.firebasechattingapplication.utils

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

val Context.myDataStore by preferencesDataStore(name = Constants.SP_Name)


object DatastoreHelper {

        suspend fun saveString(
            context: Context,
            key: String,
            value: String
        ) {
            val prefKey = stringPreferencesKey(key)

            context.myDataStore.edit {
                it[prefKey] = value
            }
        }

        suspend fun getString(
            context: Context,
            key: String,
            defaultValue: String? = null
        ): String? {

            val prefKey = stringPreferencesKey(key)

            return context.myDataStore.data.first()[prefKey] ?: defaultValue
        }
        suspend fun cleanPref(context: Context) {
            context.myDataStore.edit {
                it.clear()
            }
        }
    }


