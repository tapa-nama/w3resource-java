import java.io.File;

public class InputOutputFileSystem6 {
    public static void main(String[] args) {
        File file1 = new File("/e:/thoughtworks/xyz.txt");
        File file2 = new File("/e:/thoughtworks/az.txt");

        int compare = file1.compareTo(file2);
        System.out.println("file1 and file2 comparison: " + compare);

    }
}
