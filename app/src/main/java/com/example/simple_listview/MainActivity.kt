package com.example.simple_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private val dataName = arrayOf(
        "nama 1",
        "nama 2",
        "nama 3",
        "nama 4",
        "nama 5",
        "nama 6",
        "nama 7",
        "nama 8",
        "nama 9",
        "nama 10",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showList()

    }

    fun showList() {
        val listView = findViewById<ListView>(R.id.list_view)
        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            dataName
        )
        listView.adapter = adapter
    }
}