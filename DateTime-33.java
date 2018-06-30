import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTime33 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Next Friday is " + localDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday is " + localDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));

    }
}
