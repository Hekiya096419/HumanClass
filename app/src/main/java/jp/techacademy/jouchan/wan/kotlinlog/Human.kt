package jp.techacademy.jouchan.wan.kotlinlog

import android.util.Log

open class Human(var hobby: String, name: String, age: Int): Animal(name, age), Thinkable {
    init {
        this.hobby = hobby
        this.name = name
        this.age = age
    }
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "年は" + this.age + "歳です。")
    }

    override fun think(){
        Log.d("kotlintest", "私は" + this.hobby + "について考える。" )
    }
}