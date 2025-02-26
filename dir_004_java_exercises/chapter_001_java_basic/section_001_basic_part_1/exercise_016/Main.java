public class Main {

    public static void main(String[] args) {

        String[] array = new String[5];

        array[0] = " +\"\"\"\"\"+ ";
        array[1] = "[| o o |]";
        array[2] = " |  ^  |";
        array[3] = " | '-' |";
        array[4] = " +-----+";

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
