package com.example.kakaoclone

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*
import java.lang.Integer.parseInt


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        tv_name.text = intent.getStringExtra("name")
//        var id = intent.getStringExtra("id")
//
//        val c = Integer.parseInt(id)
//
//        iv_profile.setImageDrawable( getUsers(this).get(c-1).image)

        btn_chat.setOnClickListener {
            startActivity(Intent(this, ChattingActivity::class.java))
        }
    }
}