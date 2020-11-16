package com.example.narutoapp

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private var HeaderView: TextView? = null
private var ListViewCharData: ListView? = null
private var btnViewInfo: Button? = null
private const val UrlViewInfo = "https://github.com/NanthawatKTY/Practice_Kotlin/tree/master"

class   MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        HeaderView = findViewById(R.id.txtHeaderLists)
        ListViewCharData = findViewById(R.id.charLists)

        //Add Character image to array

        //Add img to Array
        val intPics = intArrayOf(
            R.drawable.kakashi_hatake, R.drawable.minato_namikaze,
            R.drawable.naruto, R.drawable.sasuke_part_1
        )
    }
   // var stringsName = arrayOf(res.getStringArray(R.data_naruto)) //Get data from data_naruto.xml
  // var stringsDetail = resources.getStringArray(R.array.data_detail) //Get data from data_detail.xml

}