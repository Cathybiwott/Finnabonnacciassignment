package com.example.recyclerviewsbonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersRvAdapter(var numbers:List<BigInteger>):RecyclerView.Adapter<NumbersRvAdapter.NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersRvAdapter.NumbersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item,parent,false)
        val itemView
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersRvAdapter.NumbersViewHolder, position: Int) {
        var currentNum = numbers.get(position)
        holder.tvNums.text = currentNum.toString()

    }

    override fun getItemCount(): Int {
        return numbers.size

    }
    class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvNums = itemView.findViewById<TextView>(R.id.tvNums)
    }
}