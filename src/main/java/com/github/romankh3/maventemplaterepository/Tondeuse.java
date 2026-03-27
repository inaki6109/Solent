package com.github.romankh3.maventemplaterepository;

public class Tondeuse {
    private int x;
    private int y;

    private int maxX;
    private int maxY;

    private Direction direction;

    //Constructeur
    public Tondeuse(int x, int y, Direction direction, int maxX, int maxY){
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.maxY = maxY;
        this.maxX = maxX;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(char d) {
        switch(direction){
            case N -> { if (d == 'D') this.direction=Direction.E; else if (d=='G') this.direction =Direction.W;}
            case E -> { if (d == 'D') this.direction=Direction.S; else if (d=='G') this.direction =Direction.N;}
            case S -> { if (d == 'D') this.direction=Direction.W; else if (d=='G') this.direction =Direction.E;}
            case W -> { if (d == 'D') this.direction=Direction.N; else if (d=='G') this.direction =Direction.S;}
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void avancer() {
        switch (direction) {
            case N -> { if (y < this.maxY) this.y++; }
            case S -> { if (y > 0) this.y--; }
            case E -> { if (x < this.maxX) this.x++; }
            case W -> { if (x > 0) this.x--; }
        }
    }
}
