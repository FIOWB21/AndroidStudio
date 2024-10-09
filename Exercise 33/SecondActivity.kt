package com.example.myapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("name")
        val faculty = intent.getStringExtra("faculty")
        val city = intent.getStringExtra("city")
        val infoType = intent.getStringExtra("infoType")

        val textViewInfo = findViewById<TextView>(R.id.textViewInfo)


        val displayText = when (infoType) {
            "author" -> "Ім'я: $name"
            "faculty" -> "Факультет: $faculty"
            "city" -> "Місто: $city"
            else -> "Інформація відсутня"
        }

        textViewInfo.text = displayText
    }
}
