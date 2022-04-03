package com.example.coolresume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workHistory = findViewById<Button>(R.id.workHistory)

        workHistory.setOnClickListener {
            val moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }
    }
}