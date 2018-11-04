package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreEaglesTeam = 0;
    float shotsTakenEaglesTeam = 0;
    float shotsOnGoalEaglesTeam = 0;
    float shotEfficiencyEaglesTeam = 0;

    int scoreOpposingTeam = 0;
    float shotsTakenOpposingTeam = 0;
    float shotsOnGoalOpposingTeam = 0;
    float shotEfficiencyOpposingTeam = 0;

    /****************Display the various values for the Eagles Team.*****************************/

    /**
     * Displays the given score for Team Eagles.
     */
    public void displayForTeamEagles(int score) {
        TextView scoreView = findViewById(R.id.eagles_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the total shots taken for Team Eagles.
     */
    public void displayForTeamEaglesShotsTaken(float shots) {
        TextView shotsView = findViewById(R.id.eagles_team_shots_taken);
        shotsView.setText(String.valueOf(shots));
    }

    /**
     * Displays the total shots taken on goal for Team Eagles.
     */
    public void displayForTeamEaglesShotsOnGoal(float shots) {
        TextView shotsView = findViewById(R.id.eagles_team_shots_on_goal);
        shotsView.setText(String.valueOf(shots));
    }

    /**
     * Displays the shot efficiency for Team Eagles.
     */
    public void displayForTeamEaglesShotEfficiency(float shots) {
        TextView shotsView = findViewById(R.id.eagles_team_shot_efficiency);
        shotsView.setText(String.valueOf(shots));
    }

    /*****************Display the various values for the Opposing Team.**************************/

    /**
     * Displays the given score for Opposing Team.
     */
    public void displayForTeamOpposing(int score) {
        TextView scoreView = findViewById(R.id.opposing_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the total shots taken for Opposing Team.
     */
    public void displayForTeamOpposingShotsTaken(float shots) {
        TextView shotsView = findViewById(R.id.opposing_team_shots_taken);
        shotsView.setText(String.valueOf(shots));
    }

    /**
     * Displays the total shots taken on goal for Opposing Team.
     */
    public void displayForTeamOpposingShotsOnGoal(float shots) {
        TextView shotsView = findViewById(R.id.opposing_team_shots_on_goal);
        shotsView.setText(String.valueOf(shots));
    }

    /**
     * Displays the shot efficiency for Opposing Team.
     */
    public void displayForTeamOpposingShotEfficiency(float shots) {
        TextView shotsView = findViewById(R.id.opposing_team_shot_efficiency);
        shotsView.setText(String.valueOf(shots));
    }



    /**********Buttons for Shot Taken, Shot on Goal and Goal Scored - Eagles Team***************/

    public void shotTakenEagles(View v) {
        shotsTakenEaglesTeam = shotsTakenEaglesTeam + 1;
        shotEfficiencyEaglesTeam = shotsOnGoalEaglesTeam / shotsTakenEaglesTeam;
        displayForTeamEaglesShotsOnGoal(shotsOnGoalEaglesTeam);
        displayForTeamEaglesShotsTaken(shotsTakenEaglesTeam);
        displayForTeamEaglesShotEfficiency(shotEfficiencyEaglesTeam);
    }

    public void shotOnGoalEagles(View v) {
        shotsOnGoalEaglesTeam = shotsOnGoalEaglesTeam + 1;
        shotEfficiencyEaglesTeam = shotsOnGoalEaglesTeam / (shotsTakenEaglesTeam + 1);
        displayForTeamEaglesShotsOnGoal(shotsOnGoalEaglesTeam);
        displayForTeamEaglesShotsTaken(shotsTakenEaglesTeam);
        displayForTeamEaglesShotEfficiency(shotEfficiencyEaglesTeam);
    }

    public void goalEagles(View v) {
        scoreEaglesTeam = scoreEaglesTeam + 1;
        displayForTeamEagles(scoreEaglesTeam);
    }


    /**********Buttons for Shot Taken, Shot on Goal and Goal Scored - Opposing Team***************/

    public void shotTakenOpposing(View v) {
        shotsTakenOpposingTeam = shotsTakenOpposingTeam + 1;
        shotEfficiencyOpposingTeam = shotsOnGoalOpposingTeam / shotsTakenOpposingTeam;
        displayForTeamOpposingShotsOnGoal(shotsOnGoalOpposingTeam);
        displayForTeamOpposingShotsTaken(shotsTakenOpposingTeam);
        displayForTeamOpposingShotEfficiency(shotEfficiencyOpposingTeam);
    }

    public void shotOnGoalOpposing(View v) {
        shotsOnGoalOpposingTeam = shotsOnGoalOpposingTeam + 1;
        shotEfficiencyOpposingTeam = shotsOnGoalOpposingTeam / (shotsTakenOpposingTeam + 1);
        displayForTeamOpposingShotsOnGoal(shotsOnGoalOpposingTeam);
        displayForTeamOpposingShotsTaken(shotsTakenOpposingTeam);
        displayForTeamOpposingShotEfficiency(shotEfficiencyOpposingTeam);
    }

    public void goalOpposing(View v) {
        scoreOpposingTeam = scoreOpposingTeam + 1;
        displayForTeamOpposing(scoreOpposingTeam);
    }


    public void resetScore(View view) {
        scoreEaglesTeam = 0;
        shotsTakenEaglesTeam = 0;
        shotsOnGoalEaglesTeam = 0;
        shotEfficiencyEaglesTeam = 0;
        scoreOpposingTeam = 0;
        shotsTakenOpposingTeam = 0;
        shotsOnGoalOpposingTeam = 0;
        shotEfficiencyOpposingTeam = 0;
        displayForTeamEagles(scoreEaglesTeam);
        displayForTeamEaglesShotsTaken(shotsTakenEaglesTeam);
        displayForTeamEaglesShotsOnGoal(shotsOnGoalEaglesTeam);
        displayForTeamEaglesShotEfficiency(shotEfficiencyEaglesTeam);
        displayForTeamOpposing(scoreOpposingTeam);
        displayForTeamOpposingShotsTaken(shotsTakenOpposingTeam);
        displayForTeamOpposingShotsOnGoal(shotsOnGoalOpposingTeam);
        displayForTeamOpposingShotEfficiency(shotEfficiencyOpposingTeam);
    }

}
