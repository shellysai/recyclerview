package com.techmania.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView

    var countryNameList=ArrayList<String>()
    var detaisList=ArrayList<String>()
    var imageList=ArrayList<Int>()
    lateinit var adapter:CountriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView)


        recyclerView.layoutManager=LinearLayoutManager(this@MainActivity )
        countryNameList.add("shradha")
        countryNameList.add("saburi")
        countryNameList.add("vatsalya")
        detaisList.add("Faith")
        detaisList.add("Patience")
        detaisList.add("Love")
        imageList.add(R.drawable.sai)
        imageList.add(R.drawable.sai2)
        imageList.add(R.drawable.sai3)
        adapter= CountriesAdapter(countryNameList,detaisList,imageList,this@MainActivity)
        recyclerView.adapter=adapter


    }
}