package com.wolfinfinity.simplerecyclerviewkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wolfinfinity.simplerecyclerviewkotlin.R
import com.wolfinfinity.simplerecyclerviewkotlin.model.userModel
import java.util.ArrayList

class userAdapter (val userList: ArrayList<userModel>) : RecyclerView.Adapter<userAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userName = itemView.findViewById(R.id.tvName) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_name_layout, parent, false);
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: userModel = userList[position]

        holder.userName.text = model.userName
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}