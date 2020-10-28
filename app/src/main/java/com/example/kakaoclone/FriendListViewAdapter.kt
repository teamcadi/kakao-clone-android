package com.example.kakaoclone

import android.R
import android.content.Context
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_friend_list.view.*


class FriendListViewAdapter(val listViewItemList: List<User>) : BaseAdapter() {

    override fun getCount(): Int {
        return listViewItemList.size
    }

    override fun getItem(position: Int): Any {
        return listViewItemList[position]
    }

    override fun getItemId(position: Int): Long
    {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val pos = position
        val context = parent!!.context

        if (convertView == null)
        {
            val inflater =
                (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).also {
                    convertView = it.inflate(R.layout.activity_friend_list, parent, false)
                }
        }

        val listViewItem: User = listViewItemList[pos]
        convertView!!.img_friendslist_image.background = ShapeDrawable(OvalShape())
        convertView!!.img_friendslist_image.setClipToOutline(true)

        convertView!!.img_friendslist_image.setImageDrawable(listViewItem.image)
        convertView!!.tv_friendslist_message.text = listViewItem.message
        convertView!!.tv_friendslist_name.text = listViewItem.name
        convertView!!.btn_list_song.text = listViewItem.song

        return convertView!!
    }


}