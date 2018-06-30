import java.time.LocalDate;
import java.time.Period;

public class DateTime30 {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        LocalDate givenTime = LocalDate.of(1994, 1, 3);

        Period diff = Period.between(current, givenTime);

        System.out.println("Difference between " + current + " and " +
                givenTime + " is " + diff.getYears() + " years and " + diff.getMonths() +
                " months and " + diff.getDays() + " days.");

    }
}
