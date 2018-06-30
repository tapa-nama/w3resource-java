public class Numbers8 {
    public static void main(String[] args) {
        int n = 10;
        int[] t = new int[n + 2];
        t[1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                t[j] += t[j - 1];
            }
            t[i + 1] = t[i];
            for (int j = i + 1; j > 1; j--) {
                t[j] += t[j - 1];
            }
            System.out.print(t[i + 1] - t[i] + " ");
        }
    }
}
