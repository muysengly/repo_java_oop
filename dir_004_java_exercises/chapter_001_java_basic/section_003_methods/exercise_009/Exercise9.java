public class Exercise9 {
   public static void main(String[] args) {
        print_Chars('(', 'z', 20);
    }
 public static void print_Chars(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
            System.out.print(char1 + " ");
            if (ctr % n == 0) System.out.println("");
        }
		System.out.print("\n");
    }
}
