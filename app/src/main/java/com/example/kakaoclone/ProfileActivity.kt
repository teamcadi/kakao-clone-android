package com.example.kakaoclone

import android.R
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var tv_name = findViewById<TextView>(R.id.tv_name)
        var btn_chat = findViewById<Button>(R.id.btn_chat)


        tv_name.text = intent.getStringExtra("name")
        val byteArray = intent.getByteArrayExtra("image")
        val image = BitmapFactory.decodeByteArray(byteArray, 0, byteArray!!.size)
        iv_profile.setImageBitmap(image)


        btn_chat.setOnClickListener {
            startActivity(Intent(this, ChattingActivity::class.java))
        }
    }
}