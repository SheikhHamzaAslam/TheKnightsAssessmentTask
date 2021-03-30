package com.hamza.theknightsassessmenttask.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamza.theknightsassessmenttask.R
import com.hamza.theknightsassessmenttask.model.Hatchback
import com.hamza.theknightsassessmenttask.model.SUV
import com.hamza.theknightsassessmenttask.model.Sedan

class RecyclerViewAdapter(private val context : Context,
private val vehiclesList : ArrayList<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val suvViewType = 1
    private val sedanViewType = 2
    private val hatchbackViewType = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            suvViewType -> {
                SUVViewHolder(LayoutInflater.from(context).inflate(R.layout.category_suv_layout,
                    parent, false))
            }
            sedanViewType -> {
                SedanViewHolder(LayoutInflater.from(context).inflate(R.layout.category_sedan_layout,
                    parent, false))
            }
            else -> {
                HatchbackViewHolder(LayoutInflater.from(context).inflate(R.layout.category_hatchback_layout,
                    parent, false))
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            suvViewType -> {
                val suvViewHolder = holder as SUVViewHolder
                val suv = vehiclesList[position] as SUV
                suvViewHolder.category.text = suv.category
                suvViewHolder.name.text = suv.name
                suvViewHolder.make.text = suv.make
            }
            sedanViewType -> {
                val sedanViewHolder = holder as SedanViewHolder
                val sedan = vehiclesList[position] as Sedan
                sedanViewHolder.category.text = sedan.category
                sedanViewHolder.name.text = sedan.name
                sedanViewHolder.make.text = sedan.make
            }
            hatchbackViewType -> {
                val hatchbackViewHolder = holder as HatchbackViewHolder
                val hatchback = vehiclesList[position] as Hatchback
                hatchbackViewHolder.category.text = hatchback.category
                hatchbackViewHolder.name.text = hatchback.name
                hatchbackViewHolder.make.text = hatchback.make
            }
        }
    }

    override fun getItemCount(): Int {
        return vehiclesList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            vehiclesList[position] is SUV -> {
                suvViewType
            }
            vehiclesList[position] is Sedan -> {
                sedanViewType
            }
            else -> {
                hatchbackViewType
            }
        }
    }

    class SUVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val category : TextView = itemView.findViewById(R.id.category)
        val name : TextView = itemView.findViewById(R.id.name)
        val make : TextView = itemView.findViewById(R.id.make)
    }

    class SedanViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val category : TextView = itemView.findViewById(R.id.category)
        val name : TextView = itemView.findViewById(R.id.name)
        val make : TextView = itemView.findViewById(R.id.make)
    }

    class HatchbackViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val category : TextView = itemView.findViewById(R.id.category)
        val name : TextView = itemView.findViewById(R.id.name)
        val make : TextView = itemView.findViewById(R.id.make)
    }
}