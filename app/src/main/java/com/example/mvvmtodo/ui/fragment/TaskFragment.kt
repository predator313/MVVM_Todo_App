package com.example.mvvmtodo.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.example.mvvmtodo.databinding.FrgamentTaskBinding

class TaskFragment:BindingFragment<FrgamentTaskBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FrgamentTaskBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}