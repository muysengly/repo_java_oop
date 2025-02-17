import java.io.File;

public class Exercise4 {
    public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("./abc.txt");
        if (my_file_dir.canWrite()) {
            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
        }
        if (my_file_dir.canRead()) {
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
        }
    }
}
