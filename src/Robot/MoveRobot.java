package Robot;

public class MoveRobot {

    public static void moveRobot(Robot robot, int toX, int toY) {
        final int START_X = robot.getX();
        final int START_Y = robot.getY();
        int[] stepX = new int[1];
        int[] stepY = new int[1];
        System.out.println("Move Robot.Robot to X " + toX);
        System.out.println("Move Robot.Robot to Y " + toY);

        if (robot.getDirection() == Robot.Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
            System.out.println("Robot.Robot turn Rights 2 times now direction is " + robot.getDirection());
        } else if (robot.getDirection() == Robot.Direction.UP) {
            System.out.println("Robot.Robot direction is " + robot.getDirection());
        } else if (robot.getDirection() == Robot.Direction.RIGHT) {
            robot.turnLeft();
            System.out.println("Robot.Robot turn Left 1 times now direction is " + robot.getDirection());
        } else if (robot.getDirection() == Robot.Direction.LEFT) {
            robot.turnRight();
            System.out.println("Robot.Robot turn Rights 1 times now direction is " + robot.getDirection());
        }


        if (START_X >= 0 && toX >= 0 && START_X < toX) {
            robot.turnRight();
            stepX[0] = toX - START_X;
            System.out.println("№ " + 1 + " X Step = " + stepX[0]);
        } else if (toX >= 0 && START_X > toX) {
            robot.turnLeft();
            stepX[0] = START_X - toX;
            System.out.println("№ " + 2 + " X Step = " + stepX[0]);
        } else if (START_X <= 0 && toX >= 0) {
            robot.turnRight();
            stepX[0] = Math.abs(Math.abs(START_X) + toX);
            System.out.println("№ " + 3 + " X Step = " + stepX[0] + robot.getDirection());
        } else if (START_X >= 0 && toX <= 0) {
            robot.turnLeft();
            stepX[0] = Math.abs(toX) + START_X;
            System.out.println("№ " + 4 + " X Step = " + stepX[0]);
        } else if (START_X <= 0 && toX <= 0 && START_X < toX) {
            robot.turnRight();
            stepX[0] = Math.abs(START_X) - Math.abs(toX);
            System.out.println("№ " + 5 + " X Step = " + stepX[0]);
        } else if (START_X <= 0 && toX <= 0 && START_X > toX) {
            robot.turnLeft();
            stepX[0] = Math.abs(toX) - Math.abs(START_X);
            System.out.println("№ " + 6 + " X Step = " + stepX[0]);
        }

        for (int s = stepX[0]; s != 0; s--) {
            robot.stepForward();
        }

        if (robot.getDirection() == Robot.Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
            System.out.println("Robot.Robot turn Rights 2 times now direction is " + robot.getDirection());
        } else if (robot.getDirection() == Robot.Direction.UP) {
            System.out.println("Robot.Robot direction is " + robot.getDirection());
        } else if (robot.getDirection() == Robot.Direction.RIGHT) {
            robot.turnLeft();
            System.out.println("Robot.Robot turn Left 1 times now direction is " + robot.getDirection());
        } else if (robot.getDirection() == Robot.Direction.LEFT) {
            robot.turnRight();
            System.out.println("Robot.Robot turn Rights 1 times now direction is " + robot.getDirection());
        }

        if (START_Y >= 0 && toY >= 0 && START_Y < toY) {
            stepY[0] = toY - START_Y;
            System.out.println("№ " + 1 + " Y Step = " + stepY[0]);
        } else if (toY >= 0 && START_Y > toY) {
            robot.turnLeft();
            robot.turnLeft();
            stepY[0] = START_Y - toY;
            System.out.println("№ " + 2 + " Y Step = " + stepY[0]);
        } else if (START_Y <= 0 && toY >= 0) {

            stepY[0] = Math.abs(Math.abs(START_Y) + toY);
            System.out.println("№ " + 3 + " Y Step = " + stepY[0] + robot.getDirection());
        } else if (START_Y >= 0 && toY <= 0) {
            robot.turnLeft();
            robot.turnLeft();
            stepY[0] = Math.abs(toY) + START_Y;
            System.out.println("№ " + 4 + " Y Step = " + stepY[0]);
        } else if (START_Y <= 0 && toY <= 0 && START_Y < toY) {
            stepY[0] = Math.abs(START_Y) - Math.abs(toY);
            System.out.println("№ " + 5 + " Y Step = " + stepY[0]);
        } else if (START_Y <= 0 && toY <= 0 && START_Y > toY) {
            robot.turnLeft();
            robot.turnLeft();
            stepY[0] = Math.abs(toY) - Math.abs(START_Y);
            System.out.println("№ " + 6 + " Y Step = " + stepX[0]);
        }

        for (int w = stepY[0]; w != 0; w--) {
            robot.stepForward();
        }

    }
}
