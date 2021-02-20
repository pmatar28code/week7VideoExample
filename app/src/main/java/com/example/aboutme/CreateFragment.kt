package com.example.aboutme

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDialog
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.DialogFragment
import kotlinx.coroutines.NonCancellable.cancel
import androidx.fragment.app.Fragment
import com.example.aboutme.databinding.ActivityMainBinding
import org.jetbrains.annotations.NonNls
import java.util.stream.DoubleStream.builder
import java.util.stream.IntStream.builder


class CreateFragment:DialogFragment() {
    private lateinit var onClickListener:OnClickListener
    interface OnClickListener{
        fun onPositiveClick()
        fun onNegativeClick()

    }
    companion object{
        fun create(onClickListener: OnClickListener):CreateFragment{
            return CreateFragment().apply {
                this.onClickListener = onClickListener
            }
        }
    }


        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return activity?.let {
                // Use the Builder class for convenient dialog construction
                val builder = AlertDialog.Builder(it)
                builder.setMessage(R.string.app_name)
                        .setPositiveButton(R.string.app_name,
                                DialogInterface.OnClickListener { dialog, id ->
                                    // FIRE ZE MISSILES!
                                })
                        .setNegativeButton(R.string.app_name,
                                DialogInterface.OnClickListener { dialog, id ->
                                    // User cancelled the dialog
                                })
                // Create the AlertDialog object and return it
                builder.create()
            } ?: throw IllegalStateException("Activity cannot be null")
        }
    }

