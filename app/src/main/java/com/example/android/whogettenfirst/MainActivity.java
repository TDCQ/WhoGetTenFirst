package com.example.android.whogettenfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int target = 10;
    int scoreA = target/2;
    int scoreB = target/2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneToTeamA(View view) {
        scoreA += 1;
        scoreB -= 1;
        refreshScorePanel();
    }

    public void addTwoToTeamA(View view) {
        scoreA += 2;
        scoreB -= 2;
        refreshScorePanel();
    }

    public void addThreeToTeamA(View view) {
        scoreA += 3;
        scoreB -= 3;
        refreshScorePanel();
    }

    public void addOneToTeamB(View view) {
        scoreB += 1;
        scoreA -= 1;
        refreshScorePanel();
    }

    public void addTwoToTeamB(View view) {
        scoreB += 2;
        scoreA -= 2;
        refreshScorePanel();
    }

    public void addThreeToTeamB(View view) {
        scoreB += 3;
        scoreA -= 3;
        refreshScorePanel();
    }

    public void refreshScorePanel(){
        TextView scoreOfTeamA = (TextView) findViewById(R.id.score_of_team_a);
        scoreOfTeamA.setText("" + scoreA);
        TextView scoreOfTeamB = (TextView) findViewById(R.id.score_of_team_b);
        scoreOfTeamB.setText("" + scoreB);
        if(scoreA>=target || scoreA <= 0) {
            TextView messageBox = (TextView) findViewById(R.id.system_message);
            messageBox.setText("游戏结束" + (scoreA > scoreB ? "team A":"team B") + " 赢");
        }

    }

    public void resetGame(View view) {
        TextView messageBox = (TextView) findViewById(R.id.system_message);
        messageBox.setText("");
        scoreA = target/2;
        scoreB = target/2;
        refreshScorePanel();
    }
}
