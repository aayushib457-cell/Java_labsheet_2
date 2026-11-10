

public class Q4 {
    public static void main(String[] args) {
        int visitors = 10;

        System.out.println("Initial Visitors: " + visitors);

        System.out.println("Visitor Entered: " + (++visitors));
        System.out.println("Visitor Left: " + (visitors--));

        System.out.println("Final Visitors: " + visitors);
    }
}
