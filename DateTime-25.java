import java.time.Year;

public class DateTime25 {
    public static void main(String[] args) {
        Year currentYear = Year.now();
        System.out.println("Current Year: " + currentYear);
        System.out.println("Is current year leap year? " + currentYear.isLeap());
        System.out.println("Length of the year: " + currentYear.length() + " days");
    }
}
