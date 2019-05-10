package oo5;


public class Rover {
    private int x=0;
    private int y=0;
    private Direction[] directions={Direction.N,Direction.E,Direction.S,Direction.W};
    private int directionIndex=0;


    public void command(char c){
        switch (c){
            case 'L': turnLeft();break;
            case 'R': turnRight();break;
            case 'M': move();break;
        }
    }

    private void turnLeft(){
        if (directionIndex==0)
            directionIndex=3;
        else
            directionIndex--;
    }

    private void turnRight(){
        if (directionIndex==3)
            directionIndex=0;
        else
            directionIndex++;
    }

    private void move(){
        Direction currentDirection = directions[directionIndex];
        x+= currentDirection.getX();
        y+= currentDirection.getY();
    }

    public Position getPosition() {
        return new Position(x,y,directions[directionIndex]);
    }


    public void command(String rrm) {
        for (char ch:rrm.toCharArray())
            command(ch);
    }
}
