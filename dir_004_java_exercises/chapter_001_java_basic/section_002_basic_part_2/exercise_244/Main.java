
// Importing necessary classes
import java.util.PriorityQueue;
import java.util.Scanner;

// Defining a class named "Main"
public class Main {

    // Static nested class "Dic" representing a pair of word and page number
    static class Dic implements Comparable<Dic> {
        // Instance variables to store word and page number
        String moji;
        int page;

        // Parameterized constructor to initialize word and page number
        Dic(String moji, int page) {
            this.moji = moji;
            this.page = page;
        }

        // Implementation of the compareTo method to define the natural order of Dic
        // objects
        public int compareTo(Dic d) {
            if (this.moji.equals(d.moji)) {
                return this.page - d.page;
            } else {
                return this.moji.compareTo(d.moji);
            }
        }
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Using the try-with-resources statement to automatically close the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // Creating a PriorityQueue to store Dic objects
            PriorityQueue<Dic> pq = new PriorityQueue<>();

            // Prompting the user to input pairs of a word and a page number
            System.out.println("Input pairs of a word and a page number:");

            // Reading input until there is no more input
            while (sc.hasNextLine()) {
                // Reading a line and splitting it into word and page number
                String str = sc.nextLine();
                String[] token = str.split(" ");
                String s = token[0];
                int n = Integer.parseInt(token[1]);

                // Creating a new Dic object and adding it to the PriorityQueue
                pq.add(new Dic(s, n));
            }

            // Initializing a variable to store the previous word
            String pre = "";

            // Printing the word and page number in alphabetical order
            System.out.println("\nWord and page number in alphabetical order:");
            while (!pq.isEmpty()) {
                // Polling the smallest Dic object from the PriorityQueue
                Dic dic = pq.poll();

                // Checking if the current word is the same as the previous one
                if (dic.moji.equals(pre)) {
                    System.out.print(" " + dic.page);
                } else if (pre.equals("")) {
                    System.out.println(dic.moji);
                    System.out.print(dic.page);
                } else {
                    System.out.println();
                    System.out.println(dic.moji);
                    System.out.print(dic.page);
                }
                // Updating the previous word
                pre = dic.moji;
            }
            System.out.println();
        }
    }
}
