package br.com.rafaelns.enums;

import br.com.rafaelns.exceptions.DirectionNotFoundException;

/**
 * Represents the Direction that the Robot can face and walk.<p>
 *     The {@code Direction} has three properties.
 * </p><ul>
 *     <li>{@code angle} its used internally to determine what {@code Direction} is the next clockwise or counter clockwise.</li>
 *     <li>{@code incrementBy} its used to know if it {@code Direction} increase or decrease the position on the {@code Axis}</li>
 *     <li>{@code axis} its used to inform what {@code Axis} that {@code Direction} can interact with</li>
 * </ul><p>
 *     Have a look at {@link Axis} if needed.
 * </p>
 *
 *
 */
public enum Direction {
    UP(0, 1, Axis.Y),
    DOWN(180, -1, Axis.Y),
    LEFT(270, -1, Axis.X),
    RIGHT(90, 1, Axis.X);

    protected Axis axis;
    protected int angle;
    protected int incrementBy;

    Direction(int angle, int incrementBy, Axis axis) {
        this.axis = axis;
        this.angle = angle;
        this.incrementBy = incrementBy;
    }

    /**
     * Get the {@link Axis} that the direction is related to.
     * @return {@link Axis}
     */
    public Axis getAxis() {
        return axis;
    }

    /**
     * Get {@code angle} for this {@code Direction};
     * @return the angle
     */
    protected int getAngle() {
        return angle;
    }

    /**
     * Get the increment for this {@code Direction} on the {@code Axis}
     * @return the increment (positive or negative one)
     */
    public int getIncrementBy() {
        return incrementBy;
    }

    /**
     * Get the {@code Direction} clockwise to this.
     * @return the {@link Direction} that is clockwise to this.
     */
    public Direction getClockwise() {
        int newAngle = this.angle + 90;
        if(newAngle >= 360) {
            newAngle = 0;
        }

        Direction d = getDirectionByAngle(newAngle);
        if (d != null) return d;

        throw new DirectionNotFoundException("There is a bug on turining clockwise!");
    }


    /**
     * Get the {@code Direction} counterclockwise to this.
     * @return the {@link Direction} that is counterclockwise to this.
     */
    public Direction getCounterClockwise() {
        int newAngle = this.angle - 90;
        if(newAngle < 0 ) {
            newAngle = 270;
        }

        Direction d = getDirectionByAngle(newAngle);
        if (d != null) return d;

        throw new DirectionNotFoundException("There is a bug on turning counterclockwise!");
    }

    /**
     * Use to get direction by {@code angle}.
     * @param angle for filtering the {@link Direction}
     * @return the {@link Direction} that has that angle.
     */
    private Direction getDirectionByAngle(int angle) {
        Direction[] directions = Direction.values();
        for(Direction d : directions) {
            if(d.getAngle() == angle) {
                return d;
            }
        }
        return null;
    }


}
