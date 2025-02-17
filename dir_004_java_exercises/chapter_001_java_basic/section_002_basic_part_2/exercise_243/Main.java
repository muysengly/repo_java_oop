import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
    // Nested static class named "Dic" implementing Comparable interface
    static class Dic implements Comparable<Dic> {
        String moji; // Instance variable to store a word
        int page;    // Instance variable to store a page number
        // Constructor to initialize the instance variables
        Dic(String moji, int page) {
            this.moji = moji;
            this.page = page;
        }
        // Overriding the compareTo method to define the natural ordering of Dic objects
        public int compareTo(Dic d) {
            // Comparing based on the word, then on the page number if words are equal
            if (this.moji.equals(d.moji)) {
                return this.page - d.page;
            } else {
                return this.moji.compareTo(d.moji);
            }
        }
    }
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // Creating a PriorityQueue to store Dic objects
            PriorityQueue<Dic> pq = new PriorityQueue<>();
            // Prompting the user to input pairs of a word and a page number
            System.out.println("Input pairs of a word and a page number (type 'exit' to end input):");
            // Loop to read input until there are no more lines
            while (sc.hasNextLine()) {
                // Reading a line of input and splitting it into word and page number
                String str = sc.nextLine();
                // Check for the sentinel value to exit the loop
                if (str.equals("exit")) {
                    break;
                }
                // Splitting the input line into an array of tokens
                String[] token = str.split(" ");
                // Extracting the word and page number from the tokens
                String s = token[0];
                int n = Integer.parseInt(token[1]);
                // Adding a new Dic object to the PriorityQueue
                pq.add(new Dic(s, n));
            }
            // Initializing a variable to store the previous word
            String pre = "";
            // Printing the header for the output
            System.out.println("\nWord and page number in alphabetical order:");
            // Loop to process and print the PriorityQueue
            while (!pq.isEmpty()) {
                // Polling the head of the PriorityQueue (smallest Dic object)
                Dic dic = pq.poll();
                // Checking if the current word is the same as the previous one
                if (dic.moji.equals(pre)) {
                    // Printing the page number without a newline and a space
                    System.out.print(" " + dic.page);
                } else if (pre.equals("")) {
                    // Printing the word and the page number without a newline
                    System.out.println(dic.moji);
                    System.out.print(dic.page);
                } else {
                    // Printing a newline, the word, and the page number without a newline
                    System.out.println();
                    System.out.println(dic.moji);
                    System.out.print(dic.page);
                }
                // Updating the previous word
                pre = dic.moji;
            }
            // Printing a newline at the end of the output
            System.out.println();
        }
    }
}
