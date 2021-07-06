package com.example.busschedule

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.databinding.BusStopItemBinding
import com.example.database.schedule.Schedule
import java.text.SimpleDateFormat
import java.util.*

class BusStopAdapter (private val onItemClicked: (Schedule) -> Unit)
    : ListAdapter<Schedule, BusStopAdapter.BusStopViewHolder>(DiffCallback) {

    class BusStopViewHolder(private var binding: BusStopItemBinding)
        : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SimpleDateFormat")
        fun bind(schedule: Schedule) {
            binding.stopNameTextView.text = schedule.stopName
            binding.arrivalTimeTextView.text = SimpleDateFormat(
                "h:mm a").format(
                Date(schedule.arrivalTime.toLong() * 1000)
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusStopViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BusStopViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}