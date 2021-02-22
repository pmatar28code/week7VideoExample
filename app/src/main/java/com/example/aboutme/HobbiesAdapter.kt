package com.example.aboutme

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aboutme.Model.HobbiesModel
import com.example.aboutme.databinding.ItemHobbiesBinding

class HobbiesAdapter(
    private val hobbies: MutableList<HobbiesModel>
):RecyclerView.Adapter<HobbiesAdapter.HobbiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val binding =ItemHobbiesBinding.inflate(layoutInflater,parent,false)
        return HobbiesViewHolder(binding)
    }

    override fun getItemCount()=hobbies.size

    override fun onBindViewHolder(holder: HobbiesViewHolder, position: Int) {
        val hobbie = hobbies[position]
        holder.onBind(hobbie)
    }

    class HobbiesViewHolder(
            private val binding:ItemHobbiesBinding
    ):RecyclerView.ViewHolder(binding.root){

        fun onBind(hobbie:HobbiesModel){
            binding.apply {
                hobbieName.text=hobbie.name
            }
        }
    }
}