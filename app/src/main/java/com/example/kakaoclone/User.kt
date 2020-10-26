package com.example.kakaoclone

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.content.ContextCompat

data class User(val id: Int, val image: Drawable, val name: String, val message: String, val song: String);

public fun getUsers(context: Context): List<User> {
    val userList = mutableListOf<User>()

    userList.add(User(1, ContextCompat.getDrawable(context, R.drawable.user_1)!!, "홍길동", "형을 형이라 부르지 못..", "Dynamite"))
    userList.add(User(2, ContextCompat.getDrawable(context, R.drawable.user_2)!!, "김철수", "상메", "눈누난나 (NUNU NANA)"))
    userList.add(User(3, ContextCompat.getDrawable(context, R.drawable.user_3)!!, "유승원", "상메", "DON'T TOUCH ME"))
    userList.add(User(4, ContextCompat.getDrawable(context, R.drawable.user_4)!!, "장수현", "상메", "Lovesick Girls"))
    userList.add(User(5, ContextCompat.getDrawable(context, R.drawable.user_5)!!, "임태호", "상메", "힘든 건 사랑이 아니다"))
    userList.add(User(6, ContextCompat.getDrawable(context, R.drawable.user_6)!!, "장현애", "상메", "취기를 빌려"))
    userList.add(User(7, ContextCompat.getDrawable(context, R.drawable.user_7)!!, "남태우", "상메", "놓아줘"))
    userList.add(User(8, ContextCompat.getDrawable(context, R.drawable.user_8)!!, "김승현", "상메", "오래된 노래"))
    userList.add(User(9, ContextCompat.getDrawable(context, R.drawable.user_9)!!, "강다솔", "상메", "Savage Love"))
    userList.add(User(10, ContextCompat.getDrawable(context, R.drawable.user_10)!!, "짱구", "상메", "When We Disco"))
    userList.add(User(11, ContextCompat.getDrawable(context, R.drawable.user_11)!!, "맹구", "상메", "Bad Boy"))
    userList.add(User(12, ContextCompat.getDrawable(context, R.drawable.user_12)!!, "훈이", "상메", "Dynamite"))

    return userList
}