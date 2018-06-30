import java.util.Scanner;

public class Numbers15 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        System.out.println((n.contains("0") && !n.startsWith("0")) ? "Duck Number" : "Not a Duck Number");
    }

}
