package my_class;

import java.io.Serializable;

public abstract class MyDictionary_V1 implements Serializable {

    public String[][] en_kh;

    public abstract String[][] searchWords(String word);

}
