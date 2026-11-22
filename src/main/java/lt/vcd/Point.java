package lt.vcd;

/**
 * Represents a point in two-dimensional space.
 */
public class Point {

    /** The x-coordinate of the point. */
    private int x;

    /** The y-coordinate of the point. */
    private int y;

    /**
     * Creates a point with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x-coordinate.
     *
     * @return x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-coordinate.
     *
     * @return y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the x-coordinate.
     *
     * @param x new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y-coordinate.
     *
     * @param y new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calculates distance from the origin.
     *
     * @return distance from (0,0)
     */
    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Moves the point by the specified amounts.
     *
     * @param dx horizontal movement
     * @param dy vertical movement
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Returns the point in [x;y] format.
     *
     * @return formatted point
     */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }

    /**
     * Calculates distance between this point and another point.
     *
     * @param p the other point
     * @return distance between the points
     */
    public double distance(Point p) {
        return Math.sqrt(
                Math.pow(x - p.x, 2) +
                        Math.pow(y - p.y, 2)
        );
    }

    /**
     * Updates both coordinates.
     *
     * @param x new x-coordinate
     * @param y new y-coordinate
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}