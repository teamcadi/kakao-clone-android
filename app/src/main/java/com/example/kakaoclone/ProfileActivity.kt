package com.example.kakaoclone

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_friend_list.*
import kotlinx.android.synthetic.main.activity_profile.*
import java.lang.Integer.parseInt


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val userList = getUsers(this)
        val userId = intent.getIntExtra("id", 0)

        tv_name.text = userList[userId-1].name
        iv_profile.setImageDrawable(userList[userId-1].image ?:  ContextCompat.getDrawable(this, R.drawable.kakao_profile)!!)

        btn_chat.setOnClickListener {
            startActivity(Intent(this, ChattingActivity::class.java))
        }
    }
}