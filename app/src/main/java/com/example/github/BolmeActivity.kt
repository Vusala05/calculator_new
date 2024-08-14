package com.example.github

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.github.databinding.ActivityBolmeBinding

class BolmeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBolmeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBolmeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve the result from the Intent
        val result = intent.getDoubleExtra("RESULT", 0.0)
        binding.ResultTextView.text = result.toString()
    }
}
