package com.akirachix.mentorgram

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorgram.databinding.ActivityLoginBinding
import com.akirachix.mentorgram.databinding.ActivityMainBinding

class login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView8.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        fun validateRegistration() {
            var formErr = false
            clearErrors()
            val username1 = binding.etUsename.text.toString()
            if (username1.isBlank()) {
                formErr = true
                binding.tilUsername.error = "Username is required"
            }
            val password = binding.etPassword.text.toString()
            if (password.isBlank()) {
                formErr = true
                binding.tilPassword.error = "Password is required"
            }
        }

    }
    fun clearErrors(){
        binding.tilPassword.error=null
    }
}