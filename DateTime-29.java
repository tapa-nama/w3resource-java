import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime29 {
    public static void main(String[] args) {
        String s = "June 20, 2018";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);

        System.out.println(LocalDate.parse(s, formatter));
    }
}
