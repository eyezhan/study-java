import java.io.*;

public class EmployeeTest{
    public static void main(String []args){
        /* Create 2 objects */
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        /* Call function for the two objects */
        empOne.empAge(26);
        empOne.empDesignation("高级工程师");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟工程师");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}

