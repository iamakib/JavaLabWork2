package E26;

import java.awt.*;

public class AddTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,10,20,30);

        System.out.println("Before calling add(0,0)");
        System.out.println("Location = " + box.getLocation());
        System.out.println("Width    = " + box.getWidth());
        System.out.println("Height   = " + box.getHeight());

        box.add(0,0);

        System.out.println("After calling add(0,0)");
        System.out.println("Location = " + box.getLocation());
        System.out.println("Width    = " + box.getWidth());
        System.out.println("Height   = " + box.getHeight());


    }
}
