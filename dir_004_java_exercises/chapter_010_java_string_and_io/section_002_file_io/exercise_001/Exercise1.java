import java.io.File;
import java.util.Date;

public class Exercise1 {
    public static void main(String a[]) {
        File file = new File("./");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}
