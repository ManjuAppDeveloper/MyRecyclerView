package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //hello
        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerview) as RecyclerView
        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Manjunath", "Pannapalli"))
        users.add(User("Chandu", "Bangalore"))
        users.add(User("Srinivas", "Sarjapur"))
        users.add(User("Venky", "Tirupathi"))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter


    }
}