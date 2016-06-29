package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA;
    int scoreB;

    /**
     * Displays the given scoreA for Team A.
     */
    private void displayScoreA(int number) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(number));
    }

    public void addThreeA(View view) {
        TextView teamScore = (TextView) findViewById(R.id.team_a_score);
        View parent = (View) view.getParent();
        scoreA += 3;
        displayScoreA(scoreA);
    }

    public void addTwoA(View view) {
        TextView teamScore = (TextView) findViewById(R.id.team_a_score);
        scoreA += 2;
        displayScoreA(scoreA);
    }

    public void addOneA(View view) {
        TextView teamScore = (TextView) findViewById(R.id.team_a_score);
        scoreA += 1;
        displayScoreA(scoreA);
    }

    private void displayScoreB(int newscore) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void addThreeB(View view) {
        TextView teamScore = (TextView) findViewById(R.id.team_b_score);
        scoreB += 3;
        displayScoreB(scoreB);
    }

    public void addTwoB(View view) {
        TextView teamScore = (TextView) findViewById(R.id.team_b_score);
        scoreB += 2;
        displayScoreB(scoreB);
    }

    public void addOneB(View view) {
        TextView teamScore = (TextView) findViewById(R.id.team_b_score);
        scoreB += 1;
        displayScoreB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayScoreB(scoreB);
        displayScoreA(scoreA);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
