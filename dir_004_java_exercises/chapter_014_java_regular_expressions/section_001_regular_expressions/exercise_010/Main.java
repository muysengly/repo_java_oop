import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(validate("216.08.094.196"));
        System.out.println(validate("08.008.0008.00008"));
        System.out.println(validate("01.102.103.104"));
    }

    public static String validate(String ip) {
        return ip.replaceAll("(?<=^|\\.)0+(?!\\.|$)", "");
    }
}
