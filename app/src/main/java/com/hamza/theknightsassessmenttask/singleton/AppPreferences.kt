package com.hamza.theknightsassessmenttask.singleton

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.hamza.theknightsassessmenttask.App

class AppPreferences {
    private val inAppPurchase : String = "InAppPurchase"
    private val coins : String = "Coins"
    private val packageName : String = "PackageName"

    companion object {
        var appPreferences : AppPreferences ?= null
        fun getInstance() : AppPreferences {
            return if(appPreferences == null) {
                appPreferences = AppPreferences()
                appPreferences!!
            } else {
                appPreferences!!
            }
        }
    }

    private fun getAppSharedPreferences() : SharedPreferences {
        return App.getAppContext().getSharedPreferences("AppPreferences", MODE_PRIVATE)
    }

    fun setInAppPurchase(isInAppPurchased : Boolean) {
        getAppSharedPreferences().edit().putBoolean(inAppPurchase, isInAppPurchased).apply()
    }

    fun getInAppPurchased() : Boolean {
        return getAppSharedPreferences().getBoolean(inAppPurchase, false)
    }

    fun setCoins(numOfCoins : Int) {
        getAppSharedPreferences().edit().putInt(coins, numOfCoins).apply()
    }

    fun getCoins() : Int {
        return getAppSharedPreferences().getInt(coins, 0)
    }

    fun setPackageName(packageName : String) {
        getAppSharedPreferences().edit().putString(this.packageName, packageName).apply()
    }

    fun getPackageName() : String? {
        return getAppSharedPreferences().getString(this.packageName, "Silver")
    }
}