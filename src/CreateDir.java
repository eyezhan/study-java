/*************************************************************************
	File Name: CreateDir.java
	Author:  Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Fri Aug 17 10:11:33 2018
 ************************************************************************/

import java.io.File;

public class CreateDir {
    public static void main(String args[]) {
        String dirname = "tmp/user/java/bin";
        File d = new File(dirname);
        d.mkdirs();
    }
}
