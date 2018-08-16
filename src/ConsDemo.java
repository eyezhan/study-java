/*************************************************************************
	File Name: ConsDemo.java
	Author: 
	Mail: 
	Created Time: Thu Aug 16 14:14:18 2018
 ************************************************************************/

public class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        System.out.println(t1.x + " " + t2.x);
    }
}

class MyClass {
    int x;

    MyClass() {
        x = 10;
    }
}
