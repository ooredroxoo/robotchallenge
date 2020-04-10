package br.com.rafaelns.models;

import br.com.rafaelns.exceptions.InvalidCoordinateValue;

/**
 * Simple value object to store coordinates on a consistent way.
 */
public class Coordinate {

    protected int x;
    protected int y;

    /**
     * Creates a new {@link Coordinate} object with {@code x} and {@code y} values.
     *
     * @param x position on x axis.
     * @param y position on y axis.
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get the coodinate value for {@code x} axis
     *
     * @return the coordinate value for {@code x} axis
     */
    public int getX() {
        return x;
    }

    /**
     * Set the value for {@code x} axis
     *
     * @param x the value for {@code x} axis, the value must be a positive int.
     */
    public void setX(int x) {
        if (x < 0) {
            throw new InvalidCoordinateValue("X coordinate can't be less than 0!");
        }
        this.x = x;
    }


    /**
     * Get the coodinate value for {@code y} axis
     *
     * @return the coordinate value for {@code y} axis
     */
    public int getY() {
        return y;
    }

    /**
     * Set the value for {@code y} axis
     *
     * @param y the value for {@code y} axis, the value must be a positive int.
     */
    public void setY(int y) {
        if (y < 0) {
            throw new InvalidCoordinateValue("X coordinate can't be less than 0!");
        }
        this.y = y;
    }
}
