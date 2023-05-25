package com.example.recyclerviewsbonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewsbonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        fibonacci()
    }
    fun fibonacci():List<Int>{
        var numbers = mutableListOf<Int>()
        numbers.add(0)
        numbers.add(1)

        for(i in 2 until 101){
            numbers.add(numbers[i-1]+ numbers[i-2])
        }
        binding.rvNums.layoutManager = LinearLayoutManager(this)
        val namesAdapter = NumbersRvAdapter(numbers)
        binding.rvNums.adapter = namesAdapter
        return numbers
    }
}