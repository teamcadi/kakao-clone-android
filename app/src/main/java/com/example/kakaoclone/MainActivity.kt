package com.example.kakaoclone

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_friend_list.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview:ListView
        val list = getUsers(this)
        val adapter = FriendListViewAdapter(list)

        listview = findViewById<View>(R.id.listView_Shape) as ListView

        listview.adapter = adapter

         listview.onItemClickListener =
            OnItemClickListener { parent, v, position, id ->
                val item: User = parent.getItemAtPosition(position) as User
                val nextIntent = Intent(this,ProfileActivity::class.java)
                nextIntent.putExtra("name",item.name)
                startActivity(nextIntent)
            }
    }
}