package com.example.debij.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Track score for Team A
    int scoreTeamA = 0;

    //Track score for Team B
    int scoreTeamB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// Adds 3 points to score for Team A

    public void plusThreeTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    //Adds 2 points to score for Team A

    public void plusTwoTeamA (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //Adds 1 point to score for Team A

    public void plusOneTeamA (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);;
    }


    // Adds 3 points to score for Team B

    public void plusThreeTeamB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    // Adds 2 points to score for Team B

    public void plusTwoTeamB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    // Adds 1 point to score for Team B

    public void plusOneTeamB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);;
    }

    // Resets score for Team A and Team B to zero

    public void resetAll (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
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
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
