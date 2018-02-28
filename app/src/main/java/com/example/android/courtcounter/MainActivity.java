package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int teamAPoints = 0;
    int teamBPoints = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        teamAPoints+=score;
        scoreView.setText(String.valueOf(teamAPoints));
        current();
    }
    public void reset(View view)
    {
        teamAPoints=0;
        teamBPoints=0;
        TextView textView = (TextView) findViewById(R.id.team_a_score);
                textView.setText("0");
        textView = (TextView) findViewById(R.id.team_b_score);
                textView.setText("0");
        textView = (TextView) findViewById(R.id.current);
            textView.setText("");
    }

    public void current()
    {
        TextView scoreView = (TextView) findViewById(R.id.current);
     if(teamAPoints==teamBPoints)
         scoreView.setText("Currently its a Tie.");
     else if(teamAPoints>teamBPoints)
         scoreView.setText("Team A is taking the lead");
     else
         scoreView.setText("Team B is taking the lead");

    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        teamBPoints+=score;
        scoreView.setText(String.valueOf(teamBPoints));
        current();
    }
    public void get3A(View view)
    {
        displayForTeamA(3);
    }
    public void get2A(View view)
    {
        displayForTeamA(2);
    }
    public void get1A(View view)
    {
        displayForTeamA(1);
    }
    public void get3B(View view)
    {
        displayForTeamB(3);
    }
    public void get2B(View view)
    {
        displayForTeamB(2);
    }
    public void get1B(View view)
    {
        displayForTeamB(1);
    }
}
