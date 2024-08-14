package com.example.github

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.github.databinding.ActivityMinusBinding

class MinusActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMinusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMinusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve the result from the Intent
        val result = intent.getDoubleExtra("RESULT", 0.0)
        binding.ResultTextView.text = result.toString()

    }
}