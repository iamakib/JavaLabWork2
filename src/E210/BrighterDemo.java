package E210;

import java.awt.*;

public class BrighterDemo {
    public static void main(String[] args) {
        Color rgb = new Color(50,100,150);
        Color brighterRGB = rgb.brighter();

        System.out.println("After Brighter "+" Red = "+ brighterRGB.getRed()+" Green = "+brighterRGB.getGreen() + " Blue = "+brighterRGB.getBlue());
    }
}
