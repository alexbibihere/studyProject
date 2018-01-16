import java.io.*;

/**
 * @author: yan
 * @Date: 2018/1/13/0013 10:29
 * @Description:
 */
public class Stream {

//     public static void main(String args[]) throws IOException{
//         InputStream in = new FileInputStream(new File("C:\\Users\\WISIG\\Desktop\\b.txt"));
//         OutputStream out = new FileOutputStream(new File("C:\\Users\\WISIG\\Desktop\\echo.txt"));
//         //使用流的时候 要记住关闭  不然数据无法正常显示
//         Reader reader = new FileReader("C:\\Users\\WISIG\\Desktop\\b.txt");
//         Writer writer  = new FileWriter("C:\\Users\\WISIG\\Desktop\\echo.txt");
//
//
//         BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\WISIG\\Desktop\\b.txt")));
//
//
//         int ch;
//         while(  (  ch= reader.read())!=-1){
//             System.out.println(ch);
//             writer.write(ch);
////             out.write(ch);
//         }
//         writer.close();
//         }

     public static void main(String args[]) throws IOException {
        //使用BufferedReader带缓冲区  一行一行读 速度快
                  BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\WISIG\\Desktop\\b.txt")));
         try {
             String line = null;
             while((line = reader.readLine())!=null){
                 System.out.println(line);
             }

         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}
