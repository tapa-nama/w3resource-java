import java.util.Scanner;

public class Numbers14 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isAutomorphic(n) ? "Automorphic Number" : "Not a Automorphic Number");
    }

    static boolean isAutomorphic(long num) {
        return (Long.toString(num * num)).endsWith(Long.toString(num));

    }
}
