import java.io.File;
import java.util.Date;

public class Example7 {
    public static void main(String[] args) {
        File file = new File("./test.txt");
        Date date = new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: " + date + "\n");

    }
}
