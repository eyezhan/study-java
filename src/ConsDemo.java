/*************************************************************************
	File Name: ConsDemo.java
	Author: Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Thu Aug 16 14:14:18 2018
 ************************************************************************/

public class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);
        System.out.println(t1.x + " " + t2.x);
    }
}

class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    }
}
