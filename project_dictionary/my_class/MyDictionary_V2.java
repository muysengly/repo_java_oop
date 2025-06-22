package my_class;

import java.io.Serializable;

public abstract class MyDictionary_V2 extends MyDictionary_V1 {

    public abstract void addData(String word, String translation);

    public abstract void deleteData(String word);

}
