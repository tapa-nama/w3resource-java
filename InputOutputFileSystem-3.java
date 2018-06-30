import java.io.File;

public class InputOutputFileSystem3 {
    public static void main(String[] args) {
        File my_file = new File("/e:/thoughtworks/xyz.txt");
        if (my_file.exists()) {
            System.out.println("The directory or file exists.");
        } else {
            System.out.println("The directory or file does not exist.");
        }
    }
}
