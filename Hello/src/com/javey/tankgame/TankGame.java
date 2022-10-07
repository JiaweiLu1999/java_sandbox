package com.javey.tankgame;

import javax.swing.*;

public class TankGame extends JFrame {
    private MyPanel mp = null;
    public TankGame() {
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1000, 750);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        TankGame tg = new TankGame();
    }
}
