package com.example.janken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result_activty.*

class ResultActivty : AppCompatActivity() {

    private val gu = 0
    private val choki = 1
    private val pa = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_activty)

        // 遷移元で格納したデータを取り出す
        //  第１引数: 取り出したい情報のキー
        //  第２引数: 取り出し失敗時のデフォルト値
        val id = intent.getIntExtra("MY_HAND", 0)
        //前の画面で押されたボタンにあわせて画像を表示する (条件分岐)
        when(id) {
            // ImageViewのコンテンツに画像リソースを指定する
            //  R.drawable.id名　(id名: 画像ファイル名の拡張子を除いたもの)
            R.id.gu_img_btn -> myHandImage.setImageResource(R.drawable.gu)
            R.id.choki_img_btn -> myHandImage.setImageResource(R.drawable.choki)
            R.id.pa_img_btn -> myHandImage.setImageResource(R.drawable.pa)
        }

        // コンピュータの手を決める
        val computerHand = (Math.random() * 3).toInt()
        when(computerHand) {
            // その手に合わせた画像をイメージビューに表示する
            // computerHand = 0 のとき
            gu -> comHandImage.setImageResource(R.drawable.com_gu)
            // computerHand = 1 のとき
            choki -> comHandImage.setImageResource(R.drawable.com_choki)
            // computerHand = 2 のとき
            pa -> comHandImage.setImageResource(R.drawable.com_pa)
        }

        // 勝敗を判定する
    }
}
