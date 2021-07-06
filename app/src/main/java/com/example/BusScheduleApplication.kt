package com.example

import android.app.Application
import com.example.database.AppDatabase

class BusScheduleApplication: Application() {
    val dataBase : AppDatabase by lazy { AppDatabase.getDatabase(this) }
}