
public class Counter {

    private static int count = 0;// Static variable to keep track of the count of instances

    public Counter() { // Constructor increments the static variable count
        count++;
    }

    public static int getCount() { // Static method to get the value of count
        return count;
    }

    public static void main(String[] args) { // Main method to test the Counter class
        Counter c1 = new Counter();
        System.out.println("Count: " + Counter.getCount());

        Counter c2 = new Counter();
        System.out.println("Count: " + Counter.getCount());

        Counter c3 = new Counter();
        System.out.println("Count: " + Counter.getCount());
    }
}