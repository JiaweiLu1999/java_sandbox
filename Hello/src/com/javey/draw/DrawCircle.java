package com.javey.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    private MyPanel myPanel = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(400, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.PINK);
        g.fillRect(200, 200, 30, 30);

    }
}
