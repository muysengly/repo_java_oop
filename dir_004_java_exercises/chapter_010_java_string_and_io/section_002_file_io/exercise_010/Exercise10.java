import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Reading contents from a file into byte array.
public class Exercise10 {
    public static void main(String a[]) {
        String file_name = "./test.txt";
        InputStream fins = null;
        try {
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2 * 1024];
            int read_count = 0;
            while ((read_count = fins.read(file_content)) > 0) {
                System.out.println(new String(file_content, 0, read_count - 1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fins != null)
                    fins.close();
            } catch (Exception ex) {

            }
        }
    }
}
