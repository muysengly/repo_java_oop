public class Main {
    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args) {
        Months currentMonth = Months.MAY;
        System.out.println("Current month: " + currentMonth);
    }
}
