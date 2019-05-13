package oo6;

import java.util.ArrayList;
import java.util.List;

public class FootBallMatch {

    private List<GoalListener> listeners=new ArrayList<>();



    public void registerListener(GoalListener listener){
        listeners.add(listener);
    }

    public void goal() {
        String winTeam = "";
        int teamIndex = (int) (Math.random() * 2);
        if (teamIndex % 2 == 0)
            winTeam = "China";
        else
            winTeam = "Japan";

        for (GoalListener listener : listeners) {
            listener.updateGoal(winTeam);
        }

    }
}
