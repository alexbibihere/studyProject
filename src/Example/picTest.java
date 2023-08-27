package Example;

import java.io.*;

/**
 * @author: yan
 * @Date: 2019/9/29/0029 21:11
 * @Description:
 */
public class picTest {
    public static void main(String[] args) throws IOException {
        outPutPic();
    }

    private static void outPutPic() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(new File("E:\\360WiFi"+"test.jpg"));
        byte[] b = "[B@299a06ac".getBytes();
        outputStream.write(b);
        outputStream.close();
    }
}
