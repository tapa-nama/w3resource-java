import java.io.File;
import java.io.FilenameFilter;

public class InputOutputFileSystem2 {
    public static void main(String a[]) {
        File file = new File("/e:/thoughtworks/");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".png")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String f : list) {
            System.out.println(f);
        }
    }

}
