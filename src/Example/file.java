package Example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author: yan
 * @Date: 2018/1/12/0012 17:08
 * @Description: TEST FILE
 */
public class file {
        // io流 input output stream
     public static void main(String args[]) throws IOException {
//          io();
         File file = new File("C:\\Users\\WISIG\\Desktop\\b.txt");
        // read Example.file to console
         if (file.exists()){
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String s = scanner.nextLine();
                System.out.println(s);
            }
        }
     }

    public static void io() throws IOException {
        File file = new File("C:\\Users\\WISIG\\Desktop\\b.txt");
//        if(Example.file.isDirectory()){
//            System.out.println("是个文件夹");
//            File[] files = Example.file.listFiles();
//            System.out.println();
//        }
        if (file.exists()){
            System.out.println("文件已经存在");
        }else{
            file.createNewFile();
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("resolve");
            printWriter.println("half");
            printWriter.println("vampire");
            printWriter.println("melody");
            printWriter.close();
        }
//        if(Example.file.isFile()){
//            System.out.println("是个文件");
//        }
    }
}
