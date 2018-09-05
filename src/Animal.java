/*************************************************************************
	File Name: Animal.java
	Author: Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Wed Sep  5 18:02:59 2018
 ************************************************************************/

public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void sleep() {
        System.out.println(name + "正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}
