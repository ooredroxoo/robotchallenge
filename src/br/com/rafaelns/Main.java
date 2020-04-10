package br.com.rafaelns;

import br.com.rafaelns.enums.Direction;
import br.com.rafaelns.models.Coordinate;
import br.com.rafaelns.models.Robot;

public class Main {
    public static void main(String[] args) {

        // Sample execution.
        Robot rafael = new Robot(Direction.UP, new Coordinate(10, 10));
        moveRobot(rafael, 15, 9);
        System.out.println(rafael.getX() == 15 && rafael.getY() == 9);
        moveRobot(rafael, 10, 10);
        System.out.println(rafael.getX() == 10 && rafael.getY() == 10);

    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int offY = robot.getY() - toY;
        int offX = robot.getX() - toX;
        Direction directionTowardsY = offY < 0 ? Direction.UP : Direction.DOWN;
        Direction directionTowardsX = offX < 0 ? Direction.RIGHT : Direction.LEFT;

        if (offY != 0) {
            ajustAndWalk(robot, offY, directionTowardsY);
        }

        if (offX != 0) {
            ajustAndWalk(robot, offX, directionTowardsX);
        }
    }

    private static void ajustAndWalk(Robot robot, int stepsOff, Direction directionTowards) {
        while (robot.getDirection() != directionTowards) {
            robot.turnLeft();
        }

        int stepsNeeded = stepsOff > 0 ? stepsOff : stepsOff * -1;
        for (int stepsGiven = 0; stepsGiven < stepsNeeded; stepsGiven++) {
            robot.stepForward();
        }
    }


}
