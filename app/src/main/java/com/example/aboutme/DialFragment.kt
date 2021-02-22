package com.example.aboutme

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
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
   return DialFragment().apply {
    this.onClickListener = onClickListener
   }
  }
  var TEXT="TEXT"
 }

 override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
  return activity?.let {
   val builder = AlertDialog.Builder(it)
   // Get the layout inflater
   val layoutInflater = LayoutInflater.from(requireContext())
   val view = FragmentDialogBinding.inflate(layoutInflater)

   // Inflate and set the layout for the dialog
   // Pass null as the parent view because its going in the dialog layout
   builder.setView(view.root)

           // Add action buttons
           .setPositiveButton(R.string.submit_hobbie,
                   DialogInterface.OnClickListener { dialog, id ->
                    // sign in the user ...
                    //var text = view.editTextHobbie.text.toString()
                    var text = view.hobbyEditText .text.toString()
                    HobbiesRepository.addHobbie(text)
                       this.onClickListener.onPositiveClick()
                   })
           .setNegativeButton(R.string.cancel,
                   DialogInterface.OnClickListener { dialog, id ->
                    getDialog()?.cancel()
                   })

   builder.create()
  } ?: throw IllegalStateException("Activity cannot be null")
 }
}




