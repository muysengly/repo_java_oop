// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

    // Define a constant value for character count.
    public static int MX = 26;

    // Define a class to store character frequency.
    static class freqOfChar {
        char c;
        int f;

        // Constructor for freqOfChar class.
        public freqOfChar(char c, int f) {
            this.c = c;
            this.f = f;
        }
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        String strr = "accessories";
        System.out.println("The given string is: " + strr);
        System.out.println("The string after arranging newly is: ");
        String strg = charRearrange(strr, 4);
        if (strg != null)
            System.out.println(strg);
    }

    // Method to rearrange characters in a string based on frequency and distance k.
    public static String charRearrange(String strg, int k) {
        if (strg.length() <= 1) return strg;

        // Create an array of frequency of characters.
        freqOfChar[] chr_fre = new freqOfChar[MX];
        int ctr = 0;

        // Initialize the frequency array.
        for (int i = 0; i < MX; i++) {
            chr_fre[i] = new freqOfChar((char)('a' + i), 0);
        }

        // Calculate frequency of each character in the string.
        for (int i = 0; i < strg.length(); i++) {
            char ch = strg.charAt(i);
            chr_fre[ch - 'a'].f++;
            if (chr_fre[ch - 'a'].f == 1) ctr++;
        }

        // Build a max heap based on character frequencies.
        bldOfHeap(chr_fre, MX);

        // Create arrays to store rearranged characters and their occurrences.
        char[] str1 = new char[strg.length()];
        boolean[] occu = new boolean[strg.length()];

        // Rearrange characters according to frequency and distance k.
        for (int i = 0; i < ctr; i++) {
            freqOfChar chfreq = extractMax(chr_fre, MX - i);
            int ptr = i;
            while (occu[ptr]) ptr++;

            for (int j = 0; j < chfreq.f; j++) {
                if (ptr >= str1.length)
                    return null;
                str1[ptr] = chfreq.c;
                occu[ptr] = true;
                ptr += k;
            }
        }
        return new String(str1);
    }

    // Method to build a max heap.
    private static void bldOfHeap(freqOfChar[] chr_fre, int size) {
        int i = (size - 1) / 2;
        while (i >= 0) {
            maxHeapify(chr_fre, i, size);
            i--;
        }
    }

    // Method to swap two elements in the frequency array.
    private static void swap(freqOfChar cf1, freqOfChar cf2) {
        char c = cf1.c;
        int f = cf1.f;
        cf1.c = cf2.c;
        cf1.f = cf2.f;
        cf2.c = c;
        cf2.f = f;
    }

    // Method to maintain the max heap property.
    private static void maxHeapify(freqOfChar[] chr_fre, int node, int size) {
        int l = node * 2 + 1;
        int r = node * 2 + 2;
        int largest = node;
        if (l < size && chr_fre[l].f > chr_fre[node].f) {
            largest = l;
        }
        if (r < size && chr_fre[r].f > chr_fre[largest].f) {
            largest = r;
        }
        if (largest != node) {
            swap(chr_fre[node], chr_fre[largest]);
            maxHeapify(chr_fre, largest, size);
        }
    }

    // Method to extract the maximum frequency element from the heap.
    private static freqOfChar extractMax(freqOfChar[] chr_fre, int size) {
        freqOfChar max = chr_fre[0];
        chr_fre[0] = chr_fre[size - 1];
        chr_fre[size - 1] = null;
        maxHeapify(chr_fre, 0, size - 1);
        return max;
    }
}
