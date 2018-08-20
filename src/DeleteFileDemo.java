/*************************************************************************
	File Name: DeleteFileDemo.java
	Author: Zhan Lingling 
	Mail: zhan_lingling@sina.cn
	Created Time: Mon Aug 20 14:02:16 2018
 ************************************************************************/

import java.io.File;

public class DeleteFileDemo {
    public static void main(String args[]) {
        File folder = new File("tmp/java");
        deleteFolder(folder);
    }

    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
