package com.example.github

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.github.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDoubleOrNull()
            val num2 = binding.editText2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 + num2
                val intent = Intent(this, PlusActivity::class.java)
                intent.putExtra("RESULT", result)
                startActivity(intent)
            }
        }

        binding.minusButton.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDoubleOrNull()
            val num2 = binding.editText2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 - num2
                val intent = Intent(this, MinusActivity::class.java)
                intent.putExtra("RESULT", result)
                startActivity(intent)
            }
        }
        binding.VurmaButton.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDoubleOrNull()
            val num2 = binding.editText2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                val intent = Intent(this, VurmaActivity::class.java)
                intent.putExtra("RESULT", result)
                startActivity(intent)
            }
        }

        binding.BolmeButton.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDoubleOrNull()
            val num2 = binding.editText2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    val intent = Intent(this, BolmeActivity::class.java)
                    intent.putExtra("RESULT", result)
                    startActivity(intent)
                } else {
                    // Optionally handle division by zero
                }
            }
        }
    }
}