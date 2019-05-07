package oo4;

import javax.swing.*;

public class UI {
    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Ball ball = new Ball(100, 100, 50);
        ball.addBehavior(new Bouncing());

        Ball ball1 = new Ball(200, 100, 50);
        ball1.addBehavior(new Elastic());

        Ball ball2 = new Ball(300, 100, 50);
        ball2.addBehavior(new Bouncing());
        ball2.addBehavior(new Elastic());

        BallWorld contentPane = new BallWorld(ball);
        contentPane.addBall(ball);
        contentPane.addBall(ball1);
        contentPane.addBall(ball2);

        jFrame.setContentPane(contentPane);
        jFrame.pack();
        jFrame.setVisible(true);

        while (true) {
            ball.update();
            ball1.update();
            ball2.update();
            contentPane.repaint();
            Thread.sleep(10);
        }
    }

}
