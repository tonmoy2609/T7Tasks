package lt.vcd;

/**
 * Tests Point and Line classes.
 */
public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());

        System.out.println("Distance from origin: "
                + p1.distanceFromOrigin());

        p1.translate(2, 1);
        System.out.println("After translate: " + p1);

        p1.setLocation(3, 4);
        System.out.println("After setLocation: " + p1);

        System.out.println("Distance between points: "
                + p1.distance(p2));

        p1.setX(5);
        p1.setY(3);
        System.out.println("After setters: " + p1);

        Line defaultLine = new Line();
        System.out.println("Default line: " + defaultLine);

        Line line = new Line(p1, p2);

        System.out.println("Line: " + line);
        System.out.println("Line length: " + line.length());

        line.setP1(new Point(1, 1));
        line.setP2(new Point(4, 5));

        System.out.println("Updated line: " + line);
        System.out.println("Updated line length: " + line.length());
    }
}