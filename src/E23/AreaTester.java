package E23;

import java.awt.*;

public class AreaTester {
    public static void main(String[] args) {
        Rectangle AreaTester = new Rectangle();

        AreaTester.setSize(10,5);

        double area = AreaTester.getWidth() * AreaTester.getHeight();

        System.out.println(area);

    }


}
