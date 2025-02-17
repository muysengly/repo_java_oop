import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise11 {

    public static void main(String a[]) {
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader(new FileReader("./test.txt"));
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
