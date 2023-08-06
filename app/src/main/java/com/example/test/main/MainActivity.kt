package com.example.test.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        with(binding){
            btnCalcAdd.setOnClickListener {
                textViewResult.text = Math().add(editTextFirstValue.text.toString(),editTextSecondValue.text.toString())
            }
            btnCalcDivision.setOnClickListener{
                textViewResult.text = Math().divide(editTextFirstValue.text.toString(),editTextSecondValue.text.toString())
            }
        }
    }
}