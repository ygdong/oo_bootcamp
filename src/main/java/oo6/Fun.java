package oo6;

public class Fun implements GoalListener{

    public void shout(String team){
        if ("China".equals(team))
            System.out.println("万岁");
        else
            System.out.println("yu~~~");
    }

    @Override
    public void updateGoal(String winTeam) {
        shout(winTeam);
    }
}
