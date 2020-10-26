package com.example.kakaoclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class ChattingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting)

        var edit_chat = findViewById<EditText>(R.id.edit_chat)
        var btn_input = findViewById<Button>(R.id.btn_input)

        var list_chat = arrayListOf<String>()

        var lv_chat = findViewById<ListView>(R.id.lv_chat)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,list_chat)

        btn_input.setOnClickListener {
            list_chat.add(edit_chat.text.toString())
            lv_chat.adapter = adapter
            edit_chat.setText("")
        }

    }
}