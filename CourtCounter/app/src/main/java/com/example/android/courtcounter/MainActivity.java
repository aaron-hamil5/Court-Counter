package com.example.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    

    /**
     * Code: Counters
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    /**
     * Code: Counter for Team A
     */
    public void ThreePointsTeamA (View view){
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    public void TwoPointsTeamA (View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    public void FreePointsTeamA (View view){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Code: Counter for Team B
     */
    public void ThreePointsTeamB (View view){
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }

    public void TwoPointsTeamB (View view){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    public void FreePointsTeamB (View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Rest to 0
     */
    public void Reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
