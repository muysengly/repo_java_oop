import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise16 {
    public static void main(String a[]) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            String filename = "./myfile.txt";
            FileWriter fw = new FileWriter(filename, true);
            // appends the string to the file
            fw.write("Java Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("./myfile.txt"));
            // read the file content
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
