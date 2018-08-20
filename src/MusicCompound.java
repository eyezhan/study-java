/*************************************************************************
	File Name: MusicCompound.java
	Author: Zhan Lingling
	Mail: Zhan_lingling@sina.cn
	Created Time: Mon Aug 20 14:28:22 2018
 ************************************************************************/

import java.io.*;

public class MusicCompound {
    public static void main(String args[]) {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        String fileNames[] = {"wozhizaihuni.mp3", "xingyueshenhua.mp3"};
        byte by[] = new byte[1024*8];
        try {
            fileOutputStream = new FileOutputStream("merge.mp3");
            for (int i = 0; i < 2; i++) {
                int count = 0;
                fileInputStream = new FileInputStream(fileNames[i]);
                fileInputStream.skip(1024*1024*3);
                while (fileInputStream.read(by) != -1) {
                    fileOutputStream.write(by);
                    count++;
                    System.out.println(count);
                    if (count == (1024*2/8)) {
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
