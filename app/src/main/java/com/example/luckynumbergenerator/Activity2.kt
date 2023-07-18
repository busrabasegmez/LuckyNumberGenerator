package com.example.luckynumbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random.Default.nextInt

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val shareButton : Button = findViewById(R.id.shareButton)
        val text1 : TextView =findViewById(R.id.introTextView)
        val numberText : TextView = findViewById(R.id.luckyNumberTextView)


        var userName =receiveUserName()
        var luckyNumber = randomNumberGenerator()
        numberText.setText("" +luckyNumber)
    }


    fun receiveUserName() : String {
        var bundle: Bundle? = intent.extras
        var username = bundle?.get("name").toString()
        return username
    }


    fun randomNumberGenerator(): Int{
        val luckyNumber = Random().nextInt(1000)
        return luckyNumber
    }
}

