import java.util.TreeSet;
import java.util.Iterator;

public class Exercise12 {
  public static void main(String[] args) {
    // creating TreeSet
    TreeSet<Integer> tree_num = new TreeSet<Integer>();
    TreeSet<Integer> treeheadset = new TreeSet<Integer>();

    // Add numbers in the tree
    tree_num.add(10);
    tree_num.add(22);
    tree_num.add(36);
    tree_num.add(25);
    tree_num.add(16);
    tree_num.add(70);
    tree_num.add(82);
    tree_num.add(89);
    tree_num.add(14);

    System.out.println("Strictly greater than 76 : " + tree_num.higher(76));
    System.out.println("Strictly greater than 31 : " + tree_num.higher(31));
  }
}
