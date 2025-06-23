import java.util.Arrays;
import java.util.Dictionary;

import my_class_aaa.MyDictionary;
import my_class_aaa.Register;

public class Test {
    public static void main(String[] args) {

        MyDictionary md = new MyDictionary();

        // md.addWord("_abc", "អេប៊ីស៊ី");

        System.out.println(Arrays.deepToString(md.en_kh[0]));

        md.deleteWord(0);

        System.out.println(Arrays.deepToString(md.en_kh[0]));

    }
}
