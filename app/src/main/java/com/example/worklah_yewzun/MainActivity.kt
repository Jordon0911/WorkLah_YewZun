package com.example.worklah_yewzun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = SetJobData().setJobs()
        val recyclerView = findViewById<RecyclerView>(R.id.my_recycler)
        recyclerView.adapter = Adapter(this,myDataset)
        recyclerView.setHasFixedSize(true)

    }



}

