package com.example.aboutme

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.aboutme.Model.HobbiesModel
import com.example.aboutme.databinding.FragmentDialogBinding
import com.example.aboutme.databinding.FragmentFamilyBinding
import com.example.aboutme.databinding.FragmentHobbiesBinding
import com.example.aboutme.databinding.ItemHobbiesBinding

class HobbiesAdapter(
        val hobbies: MutableList<HobbiesModel>

):RecyclerView.Adapter<HobbiesAdapter.HobbiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val binding =ItemHobbiesBinding.inflate(layoutInflater,parent,false)
        return HobbiesViewHolder(binding)
    }

    override fun getItemCount()=hobbies.size


    override fun onBindViewHolder(holder: HobbiesViewHolder, position: Int) {
        val hobbie = hobbies[position]
       // val submitButton = holder.itemView.findViewById<Button>(R.id.submit_button)
        holder.onBind(hobbies[position])

    }

    class HobbiesViewHolder(
            private val binding:ItemHobbiesBinding)
        :RecyclerView.ViewHolder(binding.root){
    fun onBind(hobbie:HobbiesModel){
        binding.apply {
            hobbieName.text=hobbie.name
        }

        }
    }
}