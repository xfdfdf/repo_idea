package package2;

import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
             is = new FileInputStream("D://aaaa.txt");
             os = new FileOutputStream("D://copyaaa.txt");
            is.transferTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != os) {
                    os.close();
                }
                if(null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
