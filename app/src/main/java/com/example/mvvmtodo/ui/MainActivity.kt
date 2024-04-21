package com.example.mvvmtodo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmtodo.R
import com.example.mvvmtodo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //added some new commits   changes

        //hi hello world every one
    }
}