package com.example.janken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    // Life cycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Button actions

    fun onJankenButtonTapped(view: View?) {
        // 開きたいアクティビティを指定してIntentクラスのインスタンスを生成する
        //  第1引数: 呼び出し元のインスタンス（環境情報などをアプリ全体で共有するためのインターフェイス）
        //  第2引数: 呼び出したいアクティビティのクラス
        //      -> ジャンケン結果画面 ResultActivity を渡している。
        val intent = Intent(this, ResultActivty::class.java)
        // アクティビティを起動します
        //  第1引数:　起動するアクティビティをセットしたIntentインスタンス
        startActivity(intent)
    }

}
