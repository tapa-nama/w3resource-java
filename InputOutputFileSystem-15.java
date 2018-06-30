import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputFileSystem15 {
    public static void main(String a[]) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            String filename = "/e:/thoughtworks/myxyz.txt";
            FileWriter fw = new FileWriter(filename, false);

            fw.write("Hello World");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("/e:/thoughtworks/myxyz.txt"));

            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
