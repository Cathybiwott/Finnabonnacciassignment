package com.example.recyclerviewsbonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewsbonacci.databinding.ActivityMainBinding
import java.math.BigInteger

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
        displayFibonacci()
    }
    fun fibonacci(n: Int):List<BigInteger>{
        val numbers = mutableListOf<BigInteger>(BigInteger.ZERO, BigInteger.ONE)
        while(numbers.size<n){
            var next = numbers[numbers.lastIndex] + numbers[numbers.lastIndex-1]
            numbers.add(next)
        }
        return numbers

        }
    fun displayFibonacci(){
        val fibNumber = fibonacci(100)
        val namesAdapter = NumbersRvAdapter(fibNumber)
        binding.rvNums.layoutManager = LinearLayoutManager(this)
        binding.rvNums.adapter = namesAdapter
        return numbers
    }
}