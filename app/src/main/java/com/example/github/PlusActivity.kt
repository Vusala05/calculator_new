package com.example.github

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.github.databinding.ActivityPlusBinding

class PlusActivity: AppCompatActivity() {

    private lateinit var binding: ActivityPlusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve the result from the Intent
        val result = intent.getDoubleExtra("RESULT", 0.0)
        binding.ResultTextView.text = result.toString()
    }
}