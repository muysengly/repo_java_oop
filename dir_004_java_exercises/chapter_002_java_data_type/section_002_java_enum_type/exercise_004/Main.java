public class Main {
    public enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        Direction direction1 = Direction.NORTH;
        Direction direction2 = Direction.WEST;

        System.out.println("First direction: " + direction1);
        System.out.println("Second direction: " + direction2);
    }
}
