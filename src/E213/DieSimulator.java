package E213;

import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Random random =new Random();

        int randomNumber = random.nextInt(6)  + 1;

        System.out.println("Random number = " + randomNumber);
    }
}
