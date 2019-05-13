package oo6;

public class ScoreBoard implements GoalListener {
    int score_of_China=0;
    int score_of_Japan=0;

    public void updateBoard(String team){
        if ("China".equals(team))
            score_of_China++;
        else
            score_of_Japan++;

        System.out.printf("China:%d,Japan:%d\n",score_of_China,score_of_Japan);
    }

    @Override
    public void updateGoal(String winTeam) {
        updateBoard(winTeam);
    }
}
