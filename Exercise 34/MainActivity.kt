package com.example.bindingapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        setOnClickListener(binding.textViewName)
        setOnClickListener(binding.textViewGroup)
        setOnClickListener(binding.textViewCity)


        binding.buttonHide.setOnClickListener {
            binding.textViewName.visibility = View.INVISIBLE
        }


        binding.buttonShow.setOnClickListener {
            binding.textViewName.visibility = View.VISIBLE
        }
    }


    private fun getRandomColor(): Int {
        val random = java.util.Random()
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }


    private fun setOnClickListener(textView: TextView) {
        textView.setOnClickListener {
            textView.setTextColor(getRandomColor())
        }
    }
}
