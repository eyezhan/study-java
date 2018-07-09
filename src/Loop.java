public class Loop {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("while");
        while(x < 20) {
            System.out.println("value of x: " + x);
            x++;
        }

        System.out.println("\ndo...while");
        x = 10;
        do {
            System.out.println("value of x: " + x);
            x++;
        } while(x < 20);
    }
}
