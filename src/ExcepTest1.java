/*************************************************************************
	File Name: ExcepTest1.java
	Author: Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Wed Sep  5 16:28:34 2018
 ************************************************************************/

public class ExcepTest1 {
    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
