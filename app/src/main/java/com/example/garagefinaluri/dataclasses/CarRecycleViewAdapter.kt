package com.example.garagefinaluri.dataclasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.garagefinaluri.R

class CarRecycleViewAdapter(private val list: List<Cars>): RecyclerView.Adapter<CarRecycleViewAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView
        val textView: TextView
        val textView2: TextView


        init {
            imageView = itemView.findViewById(R.id.imageView2)
            textView = itemView.findViewById(R.id.textView5)
            textView2 = itemView.findViewById(R.id.textView6)
        }

        fun setData(cars: Cars){

            Glide.with(itemView)
                .load(cars.imageUrl)
                .into(imageView)

            textView.text = cars.name

            textView2.text = cars.movie

        }


    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cars, parent, false)
        return PersonViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {

        val cars = list[position]

        holder.setData(cars)


    }

    override fun getItemCount() = list.size
}