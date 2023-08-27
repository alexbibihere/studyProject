package nowcoder;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FileLister {

    public static void main(String[] args) {


                String inputFilePath = "I:\\新建文本文档.txt"; // 指定输入文本文件路径
                String outputFilePath = "I:\\output.txt"; // 指定保存重复结果的输出文本文件路径

                try {
                    // 创建输入流对象读取文件
                    FileInputStream inputStream = new FileInputStream(inputFilePath);
                    Scanner scanner = new Scanner(inputStream);

                    // 创建输出流对象写入文件
                    FileWriter writer = new FileWriter(outputFilePath, true); // 追加模式写入
                    PrintWriter printWriter = new PrintWriter(writer);

                    // 使用Set集合存储已经出现过的行
                    Set<String> set = new HashSet<>();

                    // 逐行扫描文件内容，将重复的行写入到输出文件中
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (!set.add(line)) {
                            printWriter.println(line);
                        }
                    }

                    // 关闭输入输出流
                    scanner.close();
                    printWriter.close();
                    writer.close();
                    inputStream.close();
                } catch (IOException e) {
                    System.err.println("发生错误：" + e.getMessage());
                }

                System.out.println("处理完成。");
            }


//        // 指定要遍历的磁盘目录
//        File root = new File("M:\\");
//        // 指定要保存文件名的文本文件路径
//        String fileName = "I:\\fileNames.txt";
//        try {
//            // 创建输出流写入文本文件
//            FileWriter writer = new FileWriter(fileName);
//            // 递归遍历目录并将文件名写入文本文件中
//            listFiles(root, writer);
//            // 关闭输出流
//            writer.close();
//            // 输出成功信息
//            System.out.println("文件名已保存至：" + fileName);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    private static void listFiles(File dir, FileWriter writer) throws IOException {
        // 获取目录下的所有文件和文件夹
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                // 如果是文件，则将文件名写入文本文件中
                if (file.isFile()  ) {
                    if( file.getName().endsWith(".mp4") || file.getName().endsWith(".mkv")
                            ||  file.getName().endsWith(".wmv")
                            ||  file.getName().endsWith(".avi")
                            ||  file.getName().endsWith(".mov")) {
                        writer.write(file.getName() + "\r\n");
                    }
                }
                // 如果是文件夹，则递归调用自身遍历该文件夹
                else if (file.isDirectory()) {
                    listFiles(file, writer);
                }
            }
        }
    }
}
