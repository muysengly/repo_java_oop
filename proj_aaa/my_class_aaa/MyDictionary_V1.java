package my_class_aaa;

import java.io.Serializable;

public abstract class MyDictionary_V1 implements Serializable {

    public String[][] en_kh;

    public abstract String[][] searchWord(String word);
}
