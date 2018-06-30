public class Numbers7 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int temp = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i < 11; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }
    }
}
