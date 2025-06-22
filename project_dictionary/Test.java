import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Dictionary;

import my_class.CountMyDictionary;
import my_class.DatabaseManagement;
import my_class.MyDictionary_V1;
import my_class.Register;
import my_class.MyDictionary;

public class Test {
    public static void main(String[] args) throws Exception {

        MyDictionary md = new MyDictionary();
        // System.out.println(Arrays.deepToString(md.en_kh));

        // System.out.println(Arrays.deepToString(md.searchWords("Hell")));

        // md.addData("_a", "សូមបញ្ចូលពាក្យ");

        // System.out.println(Arrays.deepToString(md.en_kh[md.en_kh.length - 1]));

        // md.deleteData("_a");

        // System.out.println(Arrays.deepToString(md.en_kh[md.en_kh.length - 1]));

        md.countWords();

    }
}
