package my_class_aaa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MyDictionary extends MyDictionary_V2 {

    public MyDictionary() {

        try {

            FileInputStream fis = new FileInputStream("dictionary.tsv");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            en_kh = br.lines()
                    .map(l -> l.split("\t"))
                    .toArray(size -> new String[size][]);

        } catch (Exception e) {
        }

    }

    @Override
    public String[][] searchWord(String word) {

        Stream<String[]> stream = Arrays.stream(en_kh); // explain: convert the 2D array to a Stream of String arrays

        Stream<String[]> filter = stream.filter(row -> row[0].toLowerCase().contains(word.toLowerCase()));

        String[][] result = (String[][]) filter.toArray(size -> new String[size][]);

        return result;

    }

    @Override
    public void addWord(String word, String translation) {

        String[][] new_en_kh = Arrays.copyOf(en_kh, en_kh.length + 1);

        new_en_kh[new_en_kh.length - 1] = new String[] { word, translation };

        en_kh = new_en_kh;

    }

    @Override
    public void deleteWord(int index) {

        Stream<String[]> stream = Arrays.stream(en_kh);

        Stream<String[]> filter = stream.filter(row -> !row[0].equals(en_kh[index][0]));

        en_kh = (String[][]) filter.toArray(size -> new String[size][]);

    }

}
