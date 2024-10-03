package com.example.exercise32 // Змініть на ваше ім'я пакету

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextKilometers: EditText
    private lateinit var buttonConvert: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextKilometers = findViewById(R.id.editTextKilometers)
        buttonConvert = findViewById(R.id.buttonConvert)
        textViewResult = findViewById(R.id.textViewResult)

        buttonConvert.setOnClickListener {
            convertKilometersToNauticalMiles()
        }
    }

    private fun convertKilometersToNauticalMiles() {
        val kilometers = editTextKilometers.text.toString().toDoubleOrNull()
        if (kilometers != null) {
            // 1 км = 0.539957 морських миль
            val nauticalMiles = kilometers * 0.539957
            textViewResult.text = "Морські милі: %.2f".format(nauticalMiles)
        } else {
            textViewResult.text = "Будь ласка, введіть правильне число."
        }
    }
}
