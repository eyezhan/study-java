import java.io.*;

public class Employee{
    // this object variable is visiable to sub class
    public String name;
    // private variable, be visiable in current class
    private double salary;
    // assign name in constructor
    public Employee(String empName){
        name = empName;
    }
    // set value of salary
    public void setSalary(double empSal){
        salary = empSal;
    }
    // print information
    public void printEmp(){
        System.out.println("名字：" + name);
        System.out.println("薪水：" + salary);
    }

    public static void main(String[] args){
        Employee empOne = new Employee("RUNOOB");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
