import java.time.LocalDate;
import java.time.Period;

public class DateTime32 {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        LocalDate myBirthday = LocalDate.of(1994, 1, 3);

        Period diff = Period.between(myBirthday, current);

        System.out.println("I am " + diff.getYears() + " years, " + diff.getMonths() +
                " months and " + diff.getDays() + " days old.");

    }
}
