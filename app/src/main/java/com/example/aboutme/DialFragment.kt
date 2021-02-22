package com.example.aboutme

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import com.example.aboutme.Repository.HobbiesRepository
import com.example.aboutme.databinding.FragmentDialogBinding

class DialFragment:DialogFragment() {
 private lateinit var onClickListener: OnClickListener

 interface OnClickListener {
     fun onPositiveClick()
     fun onNegativeClick()
 }

 companion object {
    fun create(onClickListener: OnClickListener): DialFragment {
        return DialFragment().apply{
            this.onClickListener = onClickListener
        }
    }
 }

 override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
  return activity?.let {
       val builder = AlertDialog.Builder(it)
       val layoutInflater = LayoutInflater.from(requireContext())
       val view = FragmentDialogBinding.inflate(layoutInflater)

      builder.setView(view.root)
           .setPositiveButton(R.string.submit_hobbie
           ) { _, _ ->
               val text = view.hobbyEditText .text.toString()
               HobbiesRepository.addHobbie(text)
               this.onClickListener.onPositiveClick()
           }
           .setNegativeButton(R.string.cancel
          ) { _, _ ->
              dialog?.cancel()
          }

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}




