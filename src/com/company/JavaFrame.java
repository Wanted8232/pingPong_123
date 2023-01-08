package com.company;

import javax.swing.*;
import java.awt.*;

public class JavaFrame extends JFrame {
    JavaPanel panel;

    JavaFrame() {
        panel = new JavaPanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
