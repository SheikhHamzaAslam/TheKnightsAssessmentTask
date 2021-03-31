package com.hamza.theknightsassessmenttask.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hamza.theknightsassessmenttask.R
import com.hamza.theknightsassessmenttask.model.Hatchback
import com.hamza.theknightsassessmenttask.model.SUV
import com.hamza.theknightsassessmenttask.model.Sedan
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerViewActivity : AppCompatActivity() {

    private val vehiclesList = ArrayList<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        //RecyclerView with 3 different layouts

        vehiclesList.add(SUV("SUV", "Sportage", "KIA"))
        vehiclesList.add(Sedan("Sedan", "Cerato", "KIA"))
        vehiclesList.add(Hatchback("Hatchback", "Picanto", "KIA"))

        vehiclesList.add(SUV("SUV", "Tucson", "Hyundai"))
        vehiclesList.add(Sedan("Sedan", "Elantra", "Hyundai"))
        vehiclesList.add(Hatchback("Hatchback", "Santro", "Hyundai"))

        vehiclesList.add(SUV("SUV", "Vezel", "Honda"))
        vehiclesList.add(Sedan("Sedan", "Civic", "Honda"))
        vehiclesList.add(Hatchback("Hatchback", "Fit", "Honda"))

        vehiclesList.add(SUV("SUV", "Fortuner", "Toyota"))
        vehiclesList.add(Sedan("Sedan", "Corolla", "Toyota"))
        vehiclesList.add(Hatchback("Hatchback", "Aqua", "Toyota"))

        vehiclesList.add(SUV("SUV", "Vitara", "Suzuki"))
        vehiclesList.add(Sedan("Sedan", "Ciaz", "Suzuki"))
        vehiclesList.add(Hatchback("Hatchback", "Swift", "Suzuki"))

        vehiclesRV.layoutManager = LinearLayoutManager(this)
        vehiclesRV.adapter = RecyclerViewAdapter(this, vehiclesList)
    }
}