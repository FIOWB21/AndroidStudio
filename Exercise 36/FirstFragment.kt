package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Додаємо текстове поле
        val textView: TextView = view.findViewById(R.id.text_view_first)
        textView.text = getString(R.string.lab_number) // Використовуємо локалізований рядок

        return view
    }
}

