import java.io.*;

public class FileStreamTest {
    public static void main(String args[]) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("text.txt");
            for (int x=0; x<bWrite.length; x++) {
                System.out.println(bWrite[x]);
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("text.txt");
            int size = is.available();

            for (int i=0; i<size; i++) {
                System.out.print(i + " ");
                //System.out.print((char) is.read() + " ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
