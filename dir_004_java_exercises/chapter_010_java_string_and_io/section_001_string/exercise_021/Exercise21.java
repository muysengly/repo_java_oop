// Define a public class named Exercise21.
public class Exercise21 {
  // Define the main method.
  public static void main(String[] args) {
    // Declare and initialize a string variable.
    String str = "The quick brown fox jumps over the lazy dog.";

    // Get the index of all the characters of the alphabet
    // starting from the end of the String towards the beginning.
    int a = str.lastIndexOf("a", str.length() - 1);
    int b = str.lastIndexOf("b", str.length() - 1);
    int c = str.lastIndexOf("c", str.length() - 1);
    int d = str.lastIndexOf("d", str.length() - 1);
    int e = str.lastIndexOf("e", str.length() - 1);
    int f = str.lastIndexOf("f", str.length() - 1);
    int g = str.lastIndexOf("g", str.length() - 1);
    int h = str.lastIndexOf("h", str.length() - 1);
    int i = str.lastIndexOf("i", str.length() - 1);
    int j = str.lastIndexOf("j", str.length() - 1);
    int k = str.lastIndexOf("k", str.length() - 1);
    int l = str.lastIndexOf("l", str.length() - 1);
    int m = str.lastIndexOf("m", str.length() - 1);
    int n = str.lastIndexOf("n", str.length() - 1);
    int o = str.lastIndexOf("o", str.length() - 1);
    int p = str.lastIndexOf("p", str.length() - 1);
    int q = str.lastIndexOf("q", str.length() - 1);
    int r = str.lastIndexOf("r", str.length() - 1);
    int s = str.lastIndexOf("s", str.length() - 1);
    int t = str.lastIndexOf("t", str.length() - 1);
    int u = str.lastIndexOf("u", str.length() - 1);
    int v = str.lastIndexOf("v", str.length() - 1);
    int w = str.lastIndexOf("w", str.length() - 1);
    int x = str.lastIndexOf("x", str.length() - 1);
    int y = str.lastIndexOf("y", str.length() - 1);
    int z = str.lastIndexOf("z", str.length() - 1);

    // Display the results of all the lastIndexOf method calls.
    System.out.println(" a  b c  d  e  f  g  h i  j");
    System.out.println("===========================");
    System.out.println(a + " " + b + " " + c + " " + d + " " +
        e + " " + f + " " + g + " " + h + " " +
        i + " " + j + "\n");

    System.out.println("k  l  m  n  o  p q  r  s  t");
    System.out.println("===========================");
    System.out.println(k + " " + l + " " + m + " " + n + " " +
        o + " " + p + " " + q + " " + r + " " +
        s + " " + t + "\n");

    System.out.println(" u  v  w  x  y  z");
    System.out.println("=================");
    System.out.println(u + " " + v + " " + w + " " + x + " " +
        y + " " + z);
  }
}
