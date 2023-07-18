package com.example.luckynumbergenerator

import android.content.Intent
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

        shareButton.setOnClickListener(){
            shareData(userName , luckyNumber)
        }
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

    fun shareData(username:String, num :Int){

        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plaim")
        i.putExtra(Intent.EXTRA_SUBJECT,""+ username + "is lucky today")
        i.putExtra(Intent.EXTRA_TEXT, "his lucky number is ${num}")
        startActivity(i)
    }
}

