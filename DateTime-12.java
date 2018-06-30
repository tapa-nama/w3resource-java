import java.text.DateFormatSymbols;
import java.util.Locale;

public class DateTime12 {
    public static void main(String[] args) {
        //DateFormatSymbols dfs = new DateFormatSymbols(new Locale("en"));
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] daysInWeek = dfs.getWeekdays();
        for (String day : daysInWeek) {
            System.out.println(day);
        }
    }
}
