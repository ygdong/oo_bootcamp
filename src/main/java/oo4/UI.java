package oo4;

import javax.swing.*;
import java.awt.*;

public class UI {
    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Ball ball = new Ball(100, 100, 100);

        JPanel contentPane = new MyPanel(ball);
        contentPane.setPreferredSize(new Dimension(800,600));
        jFrame.setContentPane(contentPane);
        jFrame.pack();
        jFrame.setVisible(true);

        while (true) {
            ball.setX(ball.getX()+1);
            contentPane.repaint();
            Thread.sleep(10);
        }
    }

}
