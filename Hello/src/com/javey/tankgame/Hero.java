package com.javey.tankgame;

public class Hero extends Tank{
    Shot shot;
    public Hero(int x, int y, int speed) {
        super(x, y, speed);
    }

    public void startShot() {
        switch (this.getDir()) {
            case 0:
                shot = new Shot(this.getX() + 20, this.getY(), 0);
                break;
            case 1:
                shot = new Shot(this.getX() + 60, this.getY() + 20, 1);
                break;
            case 2:
                shot = new Shot(this.getX() + 20, this.getY() + 60, 2);
                break;
            case 3:
                shot = new Shot(this.getX(), this.getY() + 20, 3);
        }
        new Thread(shot).start();
    }
}
