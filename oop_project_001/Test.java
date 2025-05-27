import my_class.Validation_V2;

public class Test {
    public static void main(String[] args) {
        boolean check_string_greater_than_6 = new Validation_V2().isStringGreaterThan6("1234567");

        System.out.println("Is string greater than 6 characters? " + check_string_greater_than_6);
    }
}
