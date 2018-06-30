import java.time.LocalDate;
import java.time.Period;

public class DateTime19 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate otherDate = LocalDate.of(2016, 5, 15);

        Period diff = Period.between(otherDate, now);
        System.out.println("Difference between " + otherDate + " and " +
                now + " is " + diff.getYears() + " years and " + diff.getMonths() + " months.");

    }
}
