package com.example.kakaoclone

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class ChattingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting)

        var lv_chat = findViewById<ListView>(R.id.lv_chat)
        var edit_chat = findViewById<EditText>(R.id.edit_chat)
        var btn_input = findViewById<Button>(R.id.btn_input)

        var list_chat = arrayListOf<Chat>()

        val adapter = ChatAdpater(this, list_chat)

        btn_input.setOnClickListener {
            adapter.addItem(edit_chat.text.toString())
            lv_chat.adapter = adapter
            edit_chat.setText("")
        }

    }
}
class ChatAdpater(val context: Context, val list_chat: ArrayList<Chat>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val pos = position
        val context = parent!!.context

        if (convertView == null)
        {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.chatting_item, parent, false)
        }

        val chat_text = convertView!!.findViewById<TextView>(R.id.tv_chat_text)
        val listviewItem : Chat = list_chat[position]

        chat_text.text = listviewItem.chat_text

        return convertView
    }

    override fun getItem(position: Int): Any {
        return list_chat[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list_chat.size
    }

    fun addItem(text: String?) {
        val item = Chat()
        item.chat_text = text
        list_chat.add(item)
    }
}