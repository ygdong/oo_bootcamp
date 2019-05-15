package oo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickChangeColor implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ((JButton)e.getSource()).getParent().setBackground(Color.BLACK);
    }
}
