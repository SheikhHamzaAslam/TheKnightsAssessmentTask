package com.hamza.theknightsassessmenttask

import android.app.Application
import android.content.Context

class App : Application() {
    companion object {
        var context : Application ?= null
        fun getAppContext() : Context {
            return context!!
        }
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}