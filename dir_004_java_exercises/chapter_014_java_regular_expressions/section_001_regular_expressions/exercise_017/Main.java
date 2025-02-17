public class Main {

    public static void main(String[] args) {
        String n = "123";
        System.out.println("Original Number: " + n);
        System.out.println("Number of decimal places in the said number: " + validate(n));
        n = "112.3";
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Number of decimal places in the said number: " + validate(n));
        n = "112.03";
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Number of decimal places in the said number: " + validate(n));
        n = "112.233";
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Number of decimal places in the said number: " + validate(n));
    }

    public static Integer validate(String n) {
        int ctr = n.indexOf(".");
        return ctr > 0 ? n.length() - ctr - 1 : 0;
    }
}
