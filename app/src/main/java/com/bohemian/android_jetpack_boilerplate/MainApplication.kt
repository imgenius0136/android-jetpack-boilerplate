package com.bohemian.android_jetpack_boilerplate

import android.app.Application
import androidx.work.Configuration
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application(), Configuration.Provider {
    override fun getWorkManagerConfiguration(): Configuration {
        var loggingLevel = android.util.Log.ERROR

        if (BuildConfig.DEBUG) {
            loggingLevel = android.util.Log.DEBUG
        }

        return Configuration.Builder()
            .setMinimumLoggingLevel(loggingLevel)
            .build()
    }
}
