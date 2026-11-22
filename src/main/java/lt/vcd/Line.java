package lt.vcd;

/**
 * Represents a line between two points.
 */
public class Line {

    /** Starting point of the line. */
    private Point p1;

    /** Ending point of the line. */
    private Point p2;

    /**
     * Creates a line with default points.
     */
    public Line() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
    }

    /**
     * Creates a line between two given points.
     *
     * @param p1 starting point
     * @param p2 ending point
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Returns the starting point.
     *
     * @return starting point
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Returns the ending point.
     *
     * @return ending point
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Sets the starting point.
     *
     * @param p1 new starting point
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * Sets the ending point.
     *
     * @param p2 new ending point
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * Returns the line representation.
     *
     * @return line from p1 to p2
     */
    @Override
    public String toString() {
        return "Line from " + p1 + " to " + p2;
    }

    /**
     * Calculates the length of the line.
     *
     * @return length of the line
     */
    public double length() {
        return p1.distance(p2);
    }
}