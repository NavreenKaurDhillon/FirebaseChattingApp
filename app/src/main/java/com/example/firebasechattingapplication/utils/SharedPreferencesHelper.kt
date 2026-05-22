package com.example.firebasechattingapplication.utils

import android.content.Context
import androidx.core.content.edit
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first


//class to use shared preferences for the session data management
/*object SharedPreferencesHelper {

    fun cleanPref(context: Context) {
        val settings = context.getSharedPreferences(Constants.SP_Name, Context.MODE_PRIVATE)
        settings.edit { clear() }
    }

    fun saveString(context: Context, key: String?, value: String?) {
        val settings = context.getSharedPreferences(Constants.SP_Name, Context.MODE_PRIVATE)
        settings.edit {
            putString(key, value)
        }
    }

    fun getString(context: Context, key: String?): String? {
        return getStrings(context, key, null)
    }

    fun getStrings(context: Context, key: String?, defaultVal: String?): String? {
        val settings = context.getSharedPreferences(Constants.SP_Name, Context.MODE_PRIVATE)
        return settings.getString(key, defaultVal)
    }
}*/

//class to handle the data locally using datastore by jetpack

