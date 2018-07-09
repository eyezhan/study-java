public class SelfAddMinus {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a;
        int c = 3;
        int d = --c;
        System.out.println("进行自增运算后的值等于" + b);
        System.out.println("进行自减运算后的值等于" + d);

        int m = 5;
        int n = 5;
        int x = 2 * ++m;
        int y = 2 * n++;
        System.out.println("自增运算符前缀运算后m=" + m +", x=" + x);
        System.out.println("自增运算符后缀运算后n=" + n +", y=" + y);
    }
}
