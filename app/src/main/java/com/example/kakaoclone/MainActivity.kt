package com.example.kakaoclone

import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview:ListView
        val adapter: FriendListViewAdapter

        listview = findViewById<View>(R.id.listView_Shape) as ListView

        listview.adapter)

        adapter.addItem(
            ContextCompat.getDrawable(this, R.drawable.instagram), "instagram", "this is instagram"
        )


        listview.onItemClickListener =
            OnItemClickListener { parent, v, position, id ->
                val item: ListViewItem = parent.getItemAtPosition(position) as ListViewItem
                Toast.makeText(applicationContext, item.getTitle(), Toast.LENGTH_LONG).show()
            }
    }
}