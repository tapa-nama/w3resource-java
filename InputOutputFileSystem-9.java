import java.io.File;

public class InputOutputFileSystem9 {
    public static void main(String[] args) {
        File file = new File("/e:/thoughtworks/xyz.txt");

        System.out.println((double) file.length() / (1024 * 1024) + " mb");
        System.out.println((double) file.length() / 1024 + "  kb");
        System.out.println(file.length() + " bytes");

    }
}
