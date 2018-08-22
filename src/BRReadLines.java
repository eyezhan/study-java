/*************************************************************************
	File Name: BRReadLines.java
	Author: Zhan Lingling 
	Mail: zhan_lingling@sina.cn
	Created Time: Thu Aug 16 14:58:38 2018
 ************************************************************************/

import java.io.*;

public class BRReadLines {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}