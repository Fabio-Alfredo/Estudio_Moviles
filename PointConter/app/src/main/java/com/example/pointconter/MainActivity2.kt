package com.example.pointconter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        if(intent != null){
            intent.extras?.apply {
                val TeamAGol = getInt(MainActivity.TEAM_A_SCORE)
                val TeamBGol = getInt(MainActivity.TEAM_B_SCORE)

                findViewById<TextView>(R.id.display_result).apply {
                    text =      getString(R.string.Result_teamA_teamB, TeamAGol, TeamBGol)
                }
            }
        }
    }
}