package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.lesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

lateinit var viewModel:MainViewModel

private val binding:ActivityMainBinding by  lazy {
    ActivityMainBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.btnCount.setOnClickListener {
            viewModel.increment()
            //var i = 0
        }
        viewModel.counterLV.observe(this){id ->
            binding.resultText.text = id.toString()

        }



    }
}