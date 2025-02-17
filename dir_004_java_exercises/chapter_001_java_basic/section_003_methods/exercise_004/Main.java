
//MIT License: https://bit.ly/35gZLa3
import java.util.concurrent.TimeUnit;
//MIT License: https://bit.ly/35gZLa3
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

public class Main {

    // 14 vowels, 19 consonants
    private static final String TEXT = " ... Illinois Mathematics & Science Academy ... ";

    public static void main(String[] args) {

        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("String.charAt() solution:");
        long startTimeV1 = System.nanoTime();

        Pair pairV1 = Strings.countVowelsAndConsonantsV1(TEXT);

        displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println("Vowels: " + pairV1.vowels);
        System.out.println("Consonants: " + pairV1.consonants);

        System.out.println();
        System.out.println("Java 8, functional-style solution:");
        long startTimeV2 = System.nanoTime();

        Pair pairV2 = Strings.countVowelsAndConsonantsV2(TEXT);

        displayExecutionTime(System.nanoTime() - startTimeV2);
        System.out.println("Vowels: " + pairV2.vowels);
        System.out.println("Consonants: " + pairV2.consonants);
    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}

// MIT License: https://bit.ly/35gZLa3
class Pair<V, C> {

    final V vowels;
    final C consonants;

    public Pair(V vowels, C consonants) {
        this.vowels = vowels;
        this.consonants = consonants;
    }

    static <V, C> Pair<V, C> of(V vowels, C consonants) {
        return new Pair<>(vowels, consonants);
    }

    @Override
    public int hashCode() {
        return vowels.hashCode() ^ consonants.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }

        Pair obj = (Pair) o;
        return this.vowels.equals(obj.vowels)
                && this.consonants.equals(obj.consonants);
    }
}

class Strings {

    private static final Set<Character> allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    // Note: For Unicode supplementary characters use codePointAt() instead of
    // charAt()
    // and codePoints() instead of chars()
    // Also, note that languages can have a different number of vowels and
    // consonants
    // (e.g., in Romanian there are 7 vowels: a, e, i, o, u, ă, î (â). Therefore,
    // consider adjust the code accordingly.
    public static Pair<Integer, Integer> countVowelsAndConsonantsV1(String str) {

        if (str == null || str.isEmpty()) {
            // or throw IllegalArgumentException
            return Pair.of(-1, -1);
        }

        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }

        return Pair.of(vowels, consonants);
    }

    public static Pair<Long, Long> countVowelsAndConsonantsV2(String str) {

        if (str == null || str.isEmpty()) {
            // or throw IllegalArgumentException
            return Pair.of(-1L, -1L);
        }

        str = str.toLowerCase();

        /*
         * long vowels = str.chars()
         * .filter(c -> allVowels.contains((char) c))
         * .count();
         * long consonants = str.chars()
         * .filter(c -> !allVowels.contains((char) c))
         * .filter(ch -> (ch >= 'a' && ch <= 'z'))
         * .count();
         * return Pair.of(vowels, consonants);
         */

        // or via partitioningBy()
        Map<Boolean, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .collect(partitioningBy(c -> allVowels.contains(c), counting()));

        return Pair.of(result.get(true), result.get(false));
    }
}
