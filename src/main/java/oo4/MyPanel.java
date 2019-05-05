package oo4;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    private final Ball ball;

    public MyPanel(Ball ball) {
        this.ball = ball;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        int radius = ball.getRadius();
        int x = ball.getX() - radius;
        int y = ball.getY() - radius;
        g.fillOval(x, y, radius, radius);
    }
}
