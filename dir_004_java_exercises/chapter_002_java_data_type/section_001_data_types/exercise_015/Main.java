public class Main {
    public static void main(String[] args) {
        float fn = 0.2f;
        System.out.println("\nInitial floating number: " + fn);		
        float next_down_fn = Math.nextDown(fn);
        float next_up_fn = Math.nextUp(fn);
        System.out.println("Float " + fn + " next down is " + next_down_fn);
        System.out.println("Float " + fn + " next up is " + next_up_fn);
        double dn = 0.2d;
       System.out.println("\nInitial double number: " + dn);		
        double next_down_dn = Math.nextDown(dn);
        double next_up_dn = Math.nextUp(dn);
        System.out.println("Double " + dn + " next down is " + next_down_dn);
        System.out.println("Double " + dn + " next up is " + next_up_dn);
    }
}
