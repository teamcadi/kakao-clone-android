package com.example.kakaoclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var btn_chat = findViewById<Button>(R.id.btn_chat)

        btn_chat.setOnClickListener {
            startActivity(Intent(this, ChattingActivity::class.java))
        }
    }
}