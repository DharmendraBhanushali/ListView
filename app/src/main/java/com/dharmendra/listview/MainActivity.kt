package com.dharmendra.listview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Find View By Id for ListView

        val listview = findViewById<ListView>(R.id.listview) as ListView

        //Define ArrayList
        var arrayList = ArrayList<Int>()

        //For Loop to add numbers from 1 to 20 In arrayList

        for (i in 1..20) {

            arrayList.add(i)
        }

        //Create adapter
        val adp: ArrayAdapter<Int> = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, arrayList)

        //Set Adapter
        listview.adapter = adp

        //ListView Click
        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity, "you have Click on " + arrayList.get(position), Toast.LENGTH_LONG).show()

        }


    }
}
