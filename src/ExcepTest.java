/*************************************************************************
	File Name: ExcepTest.java
	Author: Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Thu Aug 30 17:31:05 2018
 ************************************************************************/

import java.io.*;

public class ExcepTest {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }
}
