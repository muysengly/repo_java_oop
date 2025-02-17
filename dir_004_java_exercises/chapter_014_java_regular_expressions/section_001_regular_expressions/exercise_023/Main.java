public class Main {

    public static void main(String[] args) {
        String text = "Java";
        System.out.println("Original String: " + text);
        System.out.println("Move all lower case letters to the front of the said word: " + validate(text));
        text = "JavaScript";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Move all lower case letters to the front of the said word: " + validate(text));
        text = "SQLite";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Move all lower case letters to the front of the said word: " + validate(text));
    }

    public static String validate(String text) {
        String upper_ch = "", lower_ch = "";
        for (char ch : text.toCharArray())
            if (Character.isLowerCase(ch))
                lower_ch += ch;
            else
                upper_ch += ch;
        return lower_ch + upper_ch;
    }
}
