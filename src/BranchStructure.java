public class BranchStructure {
    public static void main(String[] args) {
        int x = 30;

        if (x == 10) {
            System.out.println("Value of x is 10");
        } else if (x == 20) {
            System.out.println("Value of x is 20");
        } else if (x == 30) {
            System.out.println("Value of x is 30");
        } else {
            System.out.println("这是else语句");
        }

        int y = 10;
        if (x == 30) {
            if (y == 10) {
                System.out.println("X = 30 and Y = 10");
            }
        }
    }
}
