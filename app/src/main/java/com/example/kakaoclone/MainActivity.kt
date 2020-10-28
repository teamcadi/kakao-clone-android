package com.example.kakaoclone

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_friend_list.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = getUsers(this)
        val adapter = FriendListViewAdapter(list)

        listView_Shape.adapter =adapter

        listView_Shape.setOnItemClickListener { parent, v, position, id ->
            val item: User = parent.getItemAtPosition(position) as User
            val nextIntent = Intent(this,ProfileActivity::class.java)
            nextIntent.putExtra("name",item.name)
            startActivity(nextIntent)
        }
    }
}