package E215;

import java.awt.*;

public class PointTester {
    public static void main(String[] args) {


        Point point1 = new Point(3,4);

        Point point2 = new Point(-3,-4);

        double distance = point1.distance(point2);

        System.out.println("Expected Distance = 10.0 ");
        System.out.println("Output distance = " + distance);


    }
}
