import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Empty_File_Check {
    public static void main(String[] args) {
        try {
            checkFileNotEmpty("test1.txt");
            System.out.println("File is not empty.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkFileNotEmpty(String fileName) throws FileNotFoundException, EmptyFileException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine()) {
            scanner.close();
            throw new EmptyFileException("File is empty.");
        }

        scanner.close();
    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}
