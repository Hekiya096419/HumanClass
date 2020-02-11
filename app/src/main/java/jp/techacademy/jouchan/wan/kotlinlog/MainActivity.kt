package jp.techacademy.jouchan.wan.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("絵", "たかし", 18)
        human.say()
        human.think()

        val human2 = Human("ゲーム", "ひなた", 17)
        human2.say()
        human2.think()
    }
}
