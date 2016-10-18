package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Global variables for keeping scores.
     */
    int A_score = 0;
    int B_score = 0;
    final int POINTS_FOR_3 = 3;
    final int POINTS_FOR_2 = 2;
    final int POINTS_FOR_FREE_THROW = 1;

    /**
     * Score count system for Team A.
     */
    public void scoreCount_A(View view) {

    }

    public void A_increment_3 (View view) {
        A_score += POINTS_FOR_3;
        displayForTeamA(A_score);
    }

    public void A_increment_2 (View view) {
        A_score += POINTS_FOR_2;
        displayForTeamA(A_score);
    }

    public void A_increment_1 (View view) {
        A_score += POINTS_FOR_FREE_THROW;
        displayForTeamA(A_score);
    }

    /**
     * Score count system for Team B.
     */
    public void scoreCount_B(View view) {

    }

    public void B_increment_3 (View view) {
        B_score += POINTS_FOR_3;
        displayForTeamB(B_score);
    }

    public void B_increment_2 (View view) {
        B_score += POINTS_FOR_2;
        displayForTeamB(B_score);
    }

    public void B_increment_1 (View view) {
        B_score += POINTS_FOR_FREE_THROW;
        displayForTeamB(B_score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets scores.
     */
    public void reset (View view) {
        A_score = 0;
        B_score = 0;
        displayForTeamA(A_score);
        displayForTeamB(B_score);
    }
}