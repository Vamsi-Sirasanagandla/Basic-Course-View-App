package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflator = menuInflater
        inflator.inflate(R.menu.menu_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent: Intent = when (item.itemId) {
            R.id.quizItem -> Intent(this, QuizActivity::class.java)
            R.id.marksItem -> Intent(this, MarksActivity::class.java)
            R.id.feedbackItem -> Intent(this, FeedbackActivity::class.java)
            else -> return super.onOptionsItemSelected(item)
        }
        startActivity(intent)
        return true
    }
}