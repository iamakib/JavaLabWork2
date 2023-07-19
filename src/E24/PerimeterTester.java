/* E2.4 Write a PerimeterTester program that constructs a Rectangle object and then computes and prints its perimeter. Use the getWidth and getHeight methods. Also print the expected answer. */

package E24;

import java.awt.*;

public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle PerimeterTester = new Rectangle();

        PerimeterTester.setSize(10,5);

        double perimeter = 2 * ( PerimeterTester.getWidth() + PerimeterTester.getHeight() );

        System.out.println(perimeter);
    }
}
