package com.example.pointconter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var AddOneTeamBButton:Button
    private lateinit var DisplayScoreTeamBTextView:TextView
    private lateinit var AddOneTeamAButton:Button
    private lateinit var DisplayScoreTeamATextView:TextView
    private lateinit var AddResultGame:Button

    private var TeamAGol =0
    private var TeamBGol=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()

        if(savedInstanceState != null){
            TeamAGol=savedInstanceState.getInt(TEAM_A_SCORE)
            TeamBGol=savedInstanceState.getInt(TEAM_B_SCORE)

            DisplayScoreTeamATextView.text=TeamAGol.toString()
            DisplayScoreTeamBTextView.text=TeamBGol.toString()

        }else{
            DisplayScoreTeamATextView.text=TeamAGol.toString()
            DisplayScoreTeamBTextView.text=TeamBGol.toString()
        }
        AddListener()

    }

    fun bind(){
        AddOneTeamBButton=findViewById(R.id.add_one_team_b_button)
        AddOneTeamAButton=findViewById(R.id.add_one_team_a_button)
        DisplayScoreTeamBTextView=findViewById(R.id.display_score_team_b_text_view)
        DisplayScoreTeamATextView=findViewById(R.id.display_score_team_a_text_view)
        AddResultGame=findViewById(R.id.add_result_game)
    }

    fun AddListener(){
        AddOneTeamAButton.setOnClickListener {
            TeamAGol++
            DisplayScoreTeamATextView.text=TeamAGol.toString()
        }

        AddOneTeamBButton.setOnClickListener {
            TeamBGol++
            DisplayScoreTeamBTextView.text=TeamBGol.toString()
        }


        AddResultGame.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(TEAM_A_SCORE, TeamAGol)
            intent.putExtra(TEAM_B_SCORE, TeamBGol)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.apply {
            putInt(TEAM_A_SCORE, TeamAGol)
            putInt(TEAM_B_SCORE, TeamBGol)
        }
    }

    companion object{
        const val TEAM_A_SCORE = "TEAM_A_SCORE"
        const val TEAM_B_SCORE = "TEAM_B_SCORE"
    }
    }

