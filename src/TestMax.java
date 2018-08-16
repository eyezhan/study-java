public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i,j);
        double x = 4.6;
        double y = 9.9;
        double z = max(x, y);

        System.out.println(i + " 和 " + j + " 比较，最大值是：" + k);
        System.out.println(x + " 和 " + y + " 比较，最大值是：" + z);
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    public static double max(double num1, double num2) {
        double result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}
