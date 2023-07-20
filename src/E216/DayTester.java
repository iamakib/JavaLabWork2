package E216;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DayTester {
    public static void main(String[] args) {

       LocalDate today = LocalDate.now();

       LocalDate futureDay = today.plusDays(10);

        long difference = ChronoUnit.DAYS.between(today,futureDay);

        System.out.println("Calculated Difference " + 10);
        System.out.println("Output Difference " + difference);
    }
}
