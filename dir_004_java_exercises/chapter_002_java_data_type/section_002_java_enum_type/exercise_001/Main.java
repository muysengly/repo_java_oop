public class Main {
    public enum Days_Of_Week {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        Days_Of_Week today = Days_Of_Week.MONDAY;
        System.out.println("Today is " + today);
    }
}
