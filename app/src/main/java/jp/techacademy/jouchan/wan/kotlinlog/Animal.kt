package jp.techacademy.jouchan.wan.kotlinlog

abstract class Animal {
    //プロパティ
    var name: String
    var age: Int

    //コンストラクタ
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    //メソッド
    abstract fun say()
}
