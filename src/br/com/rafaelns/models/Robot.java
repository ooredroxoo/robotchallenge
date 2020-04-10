package br.com.rafaelns.models;

import br.com.rafaelns.enums.Axis;
import br.com.rafaelns.enums.Direction;

/**
 * This class represents our Robot<p>
 * A {@link Robot} can say what {@link Direction} it is facing, his current position, walk into the direction
 * and turn left or right.
 * </p>
 */
public class Robot {

    protected Direction facingDirection;
    protected Coordinate coordinates;
    protected int stepLength;

    /**
     * Creates a {@link Robot} with the starting {@link Direction} and {@link Coordinate}
     *
     * @param facingDirection the starting facing {@link Direction}
     * @param coordinates     the starting {@link Coordinate}
     */
    public Robot(Direction facingDirection, Coordinate coordinates) {
        this.facingDirection = facingDirection;
        this.coordinates = coordinates;
        this.stepLength = 1;
    }

    /**
     * Get the {@link Robot} current facing {@link Direction}.
     *
     * @return the current facing {@link Direction}.
     */
    public Direction getDirection() {
        return this.facingDirection;
    }

    /**
     * Get its current position on the x {@link Axis}.
     *
     * @return the position on the x {@link Axis}.
     */
    public int getX() {
        return this.coordinates.getX();
    }


    /**
     * Get its current position on the y {@link Axis}.
     *
     * @return the position on the y {@link Axis}.
     */
    public int getY() {
        return this.coordinates.getY();
    }

    /**
     * Turns the {@link Robot} facing {@link Direction} left (changes it's facing {@link Direction}).
     */
    public void turnLeft() {
        this.facingDirection = this.facingDirection.getClockwise();
    }


    /**
     * Turns the {@link Robot} facing {@link Direction} right (changes it's facing {@link Direction}).
     */
    public void turnRight() {
        this.facingDirection = this.facingDirection.getCounterClockwise();
    }

    /**
     * Steps foward in the facing {@link Direction}.
     */
    public void stepForward() {
        Axis currentAxis = this.facingDirection.getAxis();
        if (currentAxis == Axis.X) {
            this.coordinates.setX(this.getX() + this.facingDirection.getIncrementBy() * this.stepLength);
        } else if (currentAxis == Axis.Y) {
            this.coordinates.setY(this.getY() + this.facingDirection.getIncrementBy() * this.stepLength);
        }
    }
}