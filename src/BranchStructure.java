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

        // switch
        char grade = 'C';

        switch(grade) {
            case 'A':
                System.out.println("优秀");
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}
