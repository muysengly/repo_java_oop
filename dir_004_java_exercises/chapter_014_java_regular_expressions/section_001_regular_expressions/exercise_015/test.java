public class test {
 
   public static void main(String[] args) {	   
	    String text = "LOWERED";
		System.out.println("Original string: "+text);
		System.out.println("After removing vowels: New string: "+validate(text));
		text = "Java";
		System.out.println("\nOriginal string: "+text);
		System.out.println("After removing vowels: New string: "+validate(text));
		text = "MID-CENTRALIZED";
		System.out.println("\nOriginal string: "+text);
		System.out.println("After removing vowels: New string: "+validate(text));
		text = "C++";
		System.out.println("\nOriginal string: "+text);
		System.out.println("After removing vowels: New string: "+validate(text));
        }

   public static String validate(String text) {
	   String result = text.replaceAll("[aeiouAEIOU]","");
	   return result;
  }
}
