package E214;

import java.util.Random;

public class RandomPrice {
    public static void main(String[] args) {
        Random random = new Random();

        int randomPrice = random.nextInt(996) + 1000;

        float finalRandomPrice = (float)randomPrice/100;


        System.out.println("$" + finalRandomPrice);

    }
}
