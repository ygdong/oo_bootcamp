package oo4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BallWorld extends JPanel {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private final Ball ball;
    private final List<Ball> balls = new ArrayList<>();

    public BallWorld(Ball ball) {
        this.ball = ball;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    public void addBall(Ball ball){
        balls.add(ball);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Ball ball : balls) {
            int r = (int) (Math.random() * 255);
            int gg = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            Color color = new Color(r,gg,b);
            g.setColor(color);
            int radius = ball.getRadius();
            int x = ball.getX() - radius;
            int y = ball.getY() - radius;
            g.fillOval(x, y, radius * 2, radius * 2);
        }
    }
}
