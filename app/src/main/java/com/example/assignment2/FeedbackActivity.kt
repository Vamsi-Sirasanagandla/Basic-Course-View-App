package com.example.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FeedbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        val ratingLink: TextView =findViewById(R.id.displayTaskView6)
        ratingLink.setOnClickListener{
            var rating = RatingFragment()
            rating.show(supportFragmentManager,"Custom Dialog")
        }
        val button : Button = findViewById(R.id.closeButton)
        button.setOnClickListener{ view ->
            finish()
        }
    }
    fun receiveFeedback(feedback: String){
        val ratingReceived: TextView=findViewById(R.id.displayTaskView7)
        ratingReceived.text="your current feedback is: "+feedback;
    }
}