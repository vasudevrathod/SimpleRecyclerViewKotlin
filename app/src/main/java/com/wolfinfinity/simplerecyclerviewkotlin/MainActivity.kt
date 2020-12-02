package com.wolfinfinity.simplerecyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wolfinfinity.simplerecyclerviewkotlin.adapter.userAdapter
import com.wolfinfinity.simplerecyclerviewkotlin.model.userModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Init()
    }

    private fun Init() {
        val rvUserList = findViewById<RecyclerView>(R.id.rvUserList)

        val userList = ArrayList<userModel>()

        userList.add(userModel("James"))
        userList.add(userModel("Tony"))
        userList.add(userModel("Jack"))
        userList.add(userModel("Monika"))
        userList.add(userModel("Rachel"))
        userList.add(userModel("Louise"))
        userList.add(userModel("Russell"))
        userList.add(userModel("Alan"))
        userList.add(userModel("Jordan"))

        userList.add(userModel("Robert"))
        userList.add(userModel("Harry"))

        rvUserList.layoutManager = LinearLayoutManager(this)
        val adapter = userAdapter(userList)
        rvUserList.adapter = adapter
    }
}