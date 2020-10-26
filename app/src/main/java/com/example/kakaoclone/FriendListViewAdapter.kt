package com.example.kakaoclone

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_friend_list.*
import kotlinx.android.synthetic.main.activity_friend_list.view.*
import java.util.*

class FriendListViewAdapter(val listViewItemList : List<User>) : BaseAdapter() {

    override fun getCount(): Int {
        return listViewItemList.size
    }

    override fun getItem(position: Int): Any {
        return listViewItemList[position]
    }

    override fun getItemId(position: Int): Long //위치값 리턴
    {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        var convertView = convertView
        val pos = position
        val context = parent.context

        if (convertView == null)
        {
                val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.activity_friend_list, parent, false)
        }

       //val imageView = convertView.findViewById<View>(R.id.img_friendslist_image)
        //val nameTextView = convertView.findViewById<View>(R.id.tv_friendslist_name)
        //val messageTextView  = convertView.findViewById<View>(R.id.tv_friendslist_message)
       // val songTextView = convertView.findViewById<View>(R.id.btn_list_song)

        val listViewItem: FriendListActivity = listViewItemList[position]

        // 아이템 내 각 위젯에 데이터 반영

        convertView.tv_friendslist_message.text = listViewItem.

        imageView(listViewItem)
        nameTextView
        setText(listViewItem.title)

        return convertView
    }

    //baseAdapater에 정의된 기능이 아님 별도로 추가
    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    fun addItem(image: Drawable?, message: String?, name: String?, song: String?) {
        val item = FriendListActivity() // 하나의 리스트 항목을 하나의 객체로 간주함
        item.(image)
        item.message(message)
        item.set(name)
        item.(song)
        listViewItemList.add(item)
    }
}