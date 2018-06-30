import java.io.File;

public class InputOutputFileSystem4 {
    public static void main(String[] args) {
        File my_file = new File("/e:/thoughtworks/xyz.txt");
        if (my_file.canWrite()) {
            System.out.println(my_file.getAbsolutePath() + " can write.");
        } else {
            System.out.println(my_file.getAbsolutePath() + " cannot write.");
        }
        if (my_file.canRead()) {
            System.out.println(my_file.getAbsolutePath() + " can read.");
        } else {
            System.out.println(my_file.getAbsolutePath() + " cannot read.");
        }
    }
}
