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

        System.out.println("\nfor");
        for(int y = 10; y < 20; y++) {
            System.out.println("value of x: " + y);
        }

        System.out.println("\nenhanced for");
        int [] numbers = {10, 20, 30, 40, 50};
        for(int z : numbers) {
            if(z == 30) {
                break;
            }
            System.out.println(z);
        }

        System.out.println();
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String name : names) {
            System.out.println(name);
        }
    }
}
