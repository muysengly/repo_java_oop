package my_class;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyDictionary extends MyDictionary_V3 implements CountMyDictionary {

    public MyDictionary() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("dictionary.tsv"), "UTF-8"))) { // Initialize BufferedReader to read the file
            en_kh = br.lines()
                    .map(l -> l.split("\t")) // Split by tab character
                    .toArray(size -> new String[size][]); // Convert to String[][]
        } catch (Exception e) {
            en_kh = new String[0][0]; // Initialize with empty array if file reading fails
            throw new RuntimeException("Failed to load dictionary data", e);
        }

    }

    @Override
    public String[][] searchWords(String word) {
        if (word == null || word.isEmpty()) { // Check if the word is null or empty
            return new String[0][0]; // Return an empty array if no word is provided
        }

        return Arrays.stream(en_kh) // Stream through the en_kh array
                .filter(row -> row[0].toLowerCase().contains(word.toLowerCase())) // Filter rows where the first element
                                                                                  // contains the word
                                                                                  // (case-insensitive)
                .toArray(String[][]::new); // Convert the filtered stream back to a String[][]
    }

    @Override
    public void addData(String word, String translation) {
        if (word == null || translation == null || word.isEmpty() || translation.isEmpty()) {
            throw new IllegalArgumentException("Word and translation must not be null or empty");
        }

        // Check if the word already exists
        for (String[] pair : en_kh) {
            if (pair[0].equalsIgnoreCase(word)) {
                throw new IllegalArgumentException("Word already exists in the dictionary");
            }
        }

        // Add the new word and translation
        String[][] newEnKh = Arrays.copyOf(en_kh, en_kh.length + 1);
        newEnKh[newEnKh.length - 1] = new String[] { word, translation };
        en_kh = newEnKh;

    }

    @Override
    public void deleteData(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word must not be null or empty");
        }

        // Find the index of the word to delete
        int indexToDelete = -1;
        for (int i = 0; i < en_kh.length; i++) {
            if (en_kh[i][0].equalsIgnoreCase(word)) {
                indexToDelete = i;
                break;
            }
        }

        // If the word was found, remove it
        if (indexToDelete != -1) {
            String[][] newEnKh = new String[en_kh.length - 1][2];
            for (int i = 0, j = 0; i < en_kh.length; i++) {
                if (i != indexToDelete) {
                    newEnKh[j++] = en_kh[i];
                }
            }
            en_kh = (String[][]) newEnKh;
        } else {
            throw new IllegalArgumentException("Word not found in the dictionary");
        }
    }

    @Override
    public void updateTranslation(String word, String newTranslation) {

        if (word == null || newTranslation == null || word.isEmpty() || newTranslation.isEmpty()) {
            throw new IllegalArgumentException("Word and translation must not be null or empty");
        }

        // Find the index of the word to update
        for (int i = 0; i < en_kh.length; i++) {
            if (en_kh[i][0].equalsIgnoreCase(word)) {
                en_kh[i][1] = newTranslation; // Update the translation
                return;
            }
        }

        throw new IllegalArgumentException("Word not found in the dictionary");

    }

    @Override
    public void countWords() {
        if (en_kh == null || en_kh.length == 0) {
            System.out.println("The dictionary is empty.");
        } else {
            System.out.println("Number of words in the dictionary: " + en_kh.length);
        }
    }

}
