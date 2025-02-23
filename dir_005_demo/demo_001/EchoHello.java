package dir_005_my_demo.demo_001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EchoHello {
    public static void main(String[] args) {
        try {

            // Create a ProcessBuilder object
            ProcessBuilder processBuilder;

            //
            processBuilder = new ProcessBuilder("cmd.exe", "/c", "echo Hello");

            // Start the process
            Process process = processBuilder.start();

            // Read the output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for process to complete
            process.waitFor();

        } catch (IOException | InterruptedException e) {
        }
    }
}
