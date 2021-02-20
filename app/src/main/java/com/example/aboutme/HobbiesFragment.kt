package com.example.aboutme


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.service.controls.actions.FloatAction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AlertDialogLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.aboutme.databinding.FragmentHobbiesBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HobbiesFragment:Fragment(R.layout.fragment_hobbies),CreateFragment.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = FragmentHobbiesBinding.inflate(layoutInflater)
        //val view = View(requireContext())
        val button = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)

        button.setOnClickListener {
            //var fm = parentFragmentManager
            //val dialog = CreateFragment()
           //dialog.show(fm,"testing")
            val dialog = CreateFragment.create(this)
            dialog.show(parentFragmentManager, "test")
        }

        binding.hobbiesList=




        }

    override fun onPositiveClick() {
        TODO("Not yet implemented")
        var intent = Intent(,MainActivity::class.java)
        startActivity(intent)
    }

    override fun onNegativeClick() {
        TODO("Not yet implemented")
    }

}

