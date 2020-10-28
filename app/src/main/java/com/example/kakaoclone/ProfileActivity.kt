package com.example.kakaoclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var tv_name = findViewById<TextView>(R.id.tv_name)
        var btn_chat = findViewById<Button>(R.id.btn_chat)


        tv_name.text = intent.getStringExtra("name")

        btn_chat.setOnClickListener {
            startActivity(Intent(this, ChattingActivity::class.java))
        }
    }
}