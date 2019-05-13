package oo6;

public class Main {
    public static void main(String[] args) {
        FootBallMatch footBallMatch = new FootBallMatch();

        footBallMatch.registerListener(new Fun());
        footBallMatch.registerListener(new ScoreBoard());
//        footBallMatch.registerListener(other);


        for (int i = 0; i < 10; i++)
            footBallMatch.goal();
    }

}
