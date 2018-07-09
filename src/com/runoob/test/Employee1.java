import java.io.*;

public class Employee1{
    // salary is a static private variable
    private static double salary;
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "开发人员";
    public static void main(String[] args){
        salary = 1000;
        System.out.println(DEPARTMENT + "平均工资：" + salary);
    }
}

