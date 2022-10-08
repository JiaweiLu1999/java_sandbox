package com.javey.tankgame;

public class Shot implements Runnable{
    int x;
    int y;
    int dir;
    int speed = 5;
    boolean isLive = true;

    public Shot(int x, int y, int dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        while (isLive) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (dir) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
            }

            if (x < 0 || x > 1000 || y < 0 || y > 750) isLive = false;
        }
    }
}
