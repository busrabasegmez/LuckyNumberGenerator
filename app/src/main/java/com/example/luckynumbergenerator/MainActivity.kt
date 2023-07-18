package com.example.luckynumbergenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterButton : Button = findViewById(R.id.enterButton)
        val welcomeText: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.nameEditText)

        enterButton.setOnClickListener(){
            var username = editText.text

            var i = Intent(this,Activity2::class.java)

            i.putExtra("name", username)
            startActivity(i)
        }

    }
}