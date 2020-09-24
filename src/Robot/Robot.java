package Robot;

import java.math.*;

public class Robot {



    public int x;
    public int y;
    Direction dir = Direction.LEFT;

    public Robot (int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            default:
            case DOWN:
                dir = Direction.RIGHT;
                break;
            case UP:
                dir = Direction.LEFT;
                break;
            case RIGHT:
                dir = Direction.UP;
                break;
            case LEFT:
                dir = Direction.DOWN;
        }
    }

    public void turnRight() {
        switch (getDirection()) {
            default:
            case DOWN:
                dir = Direction.LEFT;
                break;
            case UP:
                dir = Direction.RIGHT;
                break;
            case RIGHT:
                dir = Direction.DOWN;
                break;
            case LEFT:
                dir = Direction.UP;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
        }
    }
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    @Override
    public String toString() {
        return "Robot.Robot{" +
                "x=" + x +
                ", y=" + y +
                ", dir=" + dir +
                '}';
    }

}



