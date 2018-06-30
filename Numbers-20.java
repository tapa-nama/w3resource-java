public class Numbers20 {
    public static void main(String args[]) {
        int n = 0;
        double res;
        while (n<=10) {
            res = Math.pow(2,Math.pow(2,n))+1;
            n++;
            System.out.println(res);
        }
    }
}
