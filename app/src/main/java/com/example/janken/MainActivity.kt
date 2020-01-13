package com.example.janken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Life cycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* じゃんけんボタンとメソッドに紐づける */
        gu_img_btn.setOnClickListener {
            onJankenButtonTapped(it)
        }
        choki_img_btn.setOnClickListener {
            onJankenButtonTapped(it)
        }
        pa_img_btn.setOnClickListener {
            onJankenButtonTapped(it)
        }
    }

    // Button actions

    fun onJankenButtonTapped(view: View?) {
        // 開きたいアクティビティを指定してIntentクラスのインスタンスを生成する
        //  第1引数: 呼び出し元のインスタンス（環境情報などをアプリ全体で共有するためのインターフェイス）
        //  第2引数: 呼び出したいアクティビティのクラス
        //      -> ジャンケン結果画面 ResultActivity を渡している。
        val intent = Intent(this, ResultActivty::class.java)
        // ResultActivityに値を渡すため、インデントにデータを格納する
        //  第1引数: 追加したい情報のキー(任意)
        //  第2引数: 追加する値
        intent.putExtra("MY_HAND", view?.id)
        // アクティビティを起動します
        //  第1引数:　起動するアクティビティをセットしたIntentインスタンス
        startActivity(intent)
    }

}
