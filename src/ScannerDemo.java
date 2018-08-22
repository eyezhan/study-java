/*************************************************************************
	File Name: ScannerDemo.java
	Author: Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Wed Aug 22 14:50:23 2018
 ************************************************************************/

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("next方式接收：");
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }

        System.out.println("nextLine方式接收：");
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }

        scan.close();
    }
}
