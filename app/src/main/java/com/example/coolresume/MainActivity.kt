package com.example.coolresume

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("IntentReset")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workHistory = findViewById<Button>(R.id.workHistory)
        workHistory.setOnClickListener {
            val moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        val callMe = findViewById<Button>(R.id.callMe)
        callMe.setOnClickListener {
            val phoneUri = Uri.parse("tel:700800900")
            val callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }

        val emailMe = findViewById<Button>(R.id.emailMe)
        emailMe.setOnClickListener {
            val mailId = "yourmail@gmail.com"
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, Uri.fromParts("mailto", mailId, null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Kilka pytań do mnie...")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Jakas tresc emaila...")
            startActivity(emailIntent)
        }
    }
}