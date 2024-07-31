package com.example.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val submit : Button = findViewById(R.id.submitButton)
        submit.setOnClickListener{ view ->
            Toast.makeText(baseContext,"Submitted Successfully",Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}