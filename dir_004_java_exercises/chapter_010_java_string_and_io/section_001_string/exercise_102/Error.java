 // Define a class named Main
public class Main {
    
    // The main method, entry point of the program
    public static void main(String[] args) {
        // Define strings to convert
        String STR_TO_INT = "1323";
        String STR_TO_LONG = "13625478965325";
        String STR_TO_FLOAT = "25.135F";
        String STR_TO_DOUBLE = "21.25478254D";
        
        // Convert String to int/Integer
        System.out.println("Convert String to int/Integer:");
        Integer toInt1 = Integer.valueOf(STR_TO_INT);
        int toInt2 = Integer.parseInt(STR_TO_INT);
        System.out.println("\"" + STR_TO_INT + "\"" + " as int is "
                + toInt1 + " and as Integer is " + toInt2);
                
        // Convert String to long/Long
        System.out.println("\nConvert String to long/Long:");
        Long toLong1 = Long.valueOf(STR_TO_LONG);
        long toLong2 = Long.parseLong(STR_TO_LONG);
        System.out.println("\"" + STR_TO_LONG + "\"" + " as long is "
                + toLong1 + " and as Long is " + toLong2);
        
        // Convert String to float/Float
        System.out.println("\nConvert String to float/Float:");
        Float toFloat1 = Float.valueOf(STR_TO_FLOAT);
        float toFloat2 = Float.parseFloat(STR_TO_FLOAT);
        System.out.println("\"" + STR_TO_FLOAT + "\"" + " as float is "
                + toFloat1 + " and as Float is " + toFloat2);
                
        // Convert String to double/Double
        System.out.println("\nConvert String to double/Double:");
        Double toDouble1 = Double.valueOf(STR_TO_DOUBLE);
        double toDouble2 = Double.parseDouble(STR_TO_DOUBLE);
        System.out.println("\"" + STR_TO_DOUBLE + "\"" + " as double is "
                + toDouble1 + " and as Double is " + toDouble2);
    }
}
