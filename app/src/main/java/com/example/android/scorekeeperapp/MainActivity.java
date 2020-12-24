package com.example.android.scorekeeperapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA;
    int scoreTeamB;
    int foulsTeamA;
    int foulsTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


    }

    public void addPointA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreA(scoreTeamA);
        Toast.makeText(this, "Point for " + getString(R.string.real_madrid).toString(), Toast.LENGTH_SHORT).show();
    }

    public void addPointB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreB(scoreTeamB);
        Toast.makeText(this, "Point for "+ getString(R.string.manchaster_united).toString(), Toast.LENGTH_SHORT).show();
    }

    public void addFoulA(View view) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsA(foulsTeamA);
        Toast.makeText(this, "Foul for " + getString(R.string.real_madrid).toString(), Toast.LENGTH_SHORT).show();

    }

    public void addFoulB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsB(foulsTeamB);
        Toast.makeText(this, "Foul for " + getString(R.string.manchaster_united).toString(), Toast.LENGTH_SHORT).show();
    }

    public void newGame(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
        displayFoulsA(foulsTeamA);
        displayFoulsB(foulsTeamB);
    }

    public void displayScoreA(int scoreTeamA) {
        TextView scoreViewA = (TextView) findViewById(R.id.score_team_a);
        TextView scoreViewB = (TextView) findViewById(R.id.score_team_b);
        scoreViewA.setText(String.valueOf(scoreTeamA));
        if (scoreTeamB < scoreTeamA) {
            scoreViewA.setTextColor(Color.GREEN);
            scoreViewB.setTextColor(Color.RED);

        } else if (scoreTeamB > scoreTeamA){
            scoreViewA.setTextColor(Color.RED);
            scoreViewB.setTextColor(Color.GREEN);
        } else {
            scoreViewA.setTextColor(Color.BLACK);
            scoreViewB.setTextColor(Color.BLACK);

        }

    }

    public void displayScoreB(int scoreTeamB) {
        TextView scoreViewB = (TextView) findViewById(R.id.score_team_b);
        TextView scoreViewA = (TextView) findViewById(R.id.score_team_a);
        scoreViewB.setText(String.valueOf(scoreTeamB));
        if (scoreTeamB > scoreTeamA) {
            scoreViewB.setTextColor(Color.GREEN);
            scoreViewA.setTextColor(Color.RED);
        } else if (scoreTeamB < scoreTeamA){
            scoreViewB.setTextColor(Color.RED);
            scoreViewA.setTextColor(Color.GREEN);
        } else {
            scoreViewB.setTextColor(Color.BLACK);
            scoreViewA.setTextColor(Color.BLACK);
        }
    }

    public void displayFoulsA(int foulsTeamA) {
        TextView foulsViewA = (TextView) findViewById(R.id.fouls_team_a);
        TextView foulsViewB = (TextView) findViewById(R.id.fouls_team_b);
        foulsViewA.setText(String.valueOf("Fouls " + foulsTeamA));

        if (foulsTeamA >= 3) {
            foulsViewA.setTextColor(Color.RED);
        } else if (foulsTeamA > 0) {
            foulsViewA.setTextColor(Color.YELLOW);
        } else {
            foulsViewA.setTextColor(Color.BLACK);
        }
    }

    public void displayFoulsB(int foulsTeamB) {
        TextView foulsViewB = (TextView) findViewById(R.id.fouls_team_b);
        foulsViewB.setText(String.valueOf("Fouls " + foulsTeamB));
        if (foulsTeamB >= 3) {
            foulsViewB.setTextColor(Color.RED);
        } else if (foulsTeamB > 0) {
            foulsViewB.setTextColor(Color.YELLOW);
        } else {
            foulsViewB.setTextColor(Color.BLACK);
        }
    }
}