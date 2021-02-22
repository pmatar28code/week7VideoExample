package com.example.aboutme
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aboutme.Repository.HobbiesRepository
import com.example.aboutme.databinding.FragmentHobbiesBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HobbiesFragment :Fragment(R.layout.fragment_hobbies),DialFragment.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = FragmentHobbiesBinding.bind(view)
        view.findViewById<FloatingActionButton>(R.id.floatingActionButton)

        binding.floatingActionButton.setOnClickListener {
            val dialog = DialFragment.create(this)
            dialog.show(parentFragmentManager, "test")
        }
        binding.hobbiesList.apply{
            adapter = HobbiesAdapter(HobbiesRepository.getHobbies())
            onPositiveClick()
                adapter?.notifyDataSetChanged()

                layoutManager = LinearLayoutManager(context,
                        LinearLayoutManager.VERTICAL,
                        false)
            }
        }

    override fun onPositiveClick() {
    }

    override fun onNegativeClick() {

    }
}

