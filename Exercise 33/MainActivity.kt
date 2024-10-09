package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val facultyEditText = findViewById<EditText>(R.id.editTextFaculty)
        val cityEditText = findViewById<EditText>(R.id.editTextCity)


        val buttonAuthor = findViewById<Button>(R.id.buttonAuthor)
        buttonAuthor.setOnClickListener {
            val name = nameEditText.text.toString()
            val faculty = facultyEditText.text.toString()
            val city = cityEditText.text.toString()
            openSecondActivity(name, faculty, city, "author")
        }


        val buttonFaculty = findViewById<Button>(R.id.buttonFaculty)
        buttonFaculty.setOnClickListener {
            val name = nameEditText.text.toString()
            val faculty = facultyEditText.text.toString()
            val city = cityEditText.text.toString()
            openSecondActivity(name, faculty, city, "faculty")
        }


        val buttonCity = findViewById<Button>(R.id.buttonCity)
        buttonCity.setOnClickListener {
            val name = nameEditText.text.toString()
            val faculty = facultyEditText.text.toString()
            val city = cityEditText.text.toString()
            openSecondActivity(name, faculty, city, "city")
        }
    }


    private fun openSecondActivity(name: String, faculty: String, city: String, infoType: String) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("faculty", faculty)
        intent.putExtra("city", city)
        intent.putExtra("infoType", infoType)
        startActivity(intent)
    }
}
