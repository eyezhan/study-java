/*************************************************************************
	File Name: SuperThisTest.java
	Author: Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Wed Sep  5 18:17:34 2018
 ************************************************************************/

class Animal {
    void eat() {
        System.out.println("Animal : eat");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog : eat");
    }
    void eatTest() {
        this.eat();
        super.eat();
    }
}

public class SuperThisTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}
