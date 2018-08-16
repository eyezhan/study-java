/*************************************************************************
	File Name: BRRead.java
	Author: Zhan Lingling 
	Mail: Zhan_lingling@sina.cn
	Created Time: Thu Aug 16 14:50:59 2018
 ************************************************************************/

import java.io.*;

public class BRRead {
    public static void main(String args[]) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'键退出。");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}

