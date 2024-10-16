package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        // Додаємо текстове поле
        val textView: TextView = view.findViewById(R.id.text_view_third)
        textView.text = getString(R.string.thank_you) // Використовуємо локалізований рядок

        return view
    }
}

