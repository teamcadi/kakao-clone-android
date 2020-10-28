package com.example.kakaoclone

import android.content.Intent
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.ByteArrayOutputStream


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = getUsers(this)
        val adapter = FriendListViewAdapter(list)

        listView_Shape.adapter =adapter

        listView_Shape.setOnItemClickListener { parent, v, position, id ->
            val item: User = parent.getItemAtPosition(position) as User
            val nextIntent = Intent(this, ProfileActivity::class.java)
            nextIntent.putExtra("name", item.name)
//
//           nextIntent.putExtra("id",""+item.id)
//
            startActivity(nextIntent)
        }
    }
}