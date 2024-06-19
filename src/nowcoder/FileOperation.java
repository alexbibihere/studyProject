package nowcoder;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * @Author yandg
 * @Date
 * @Description 文件操作类
 */
public class FileOperation {

    public static void main(String[] args) throws IOException {

        // 筛选重复文件名
        //FilterDuplicateFileName();

        // 遍历所有文件夹保存到指定文本中
//        saveAllFiles();

        // 遍历输出磁盘所有文件夹及大小
        loopOutEachFileDirectoryAndSize();

        // 重命名并去掉包含指定字段的
//        RenameAllFiles();
    }

    /**
     * 遍历输出所有文件夹大小
     */
    private static void loopOutEachFileDirectoryAndSize() throws IOException {
        File file = new File("K:\\");
        String fileName = "K:\\fileSize.txt";
        // 创建输出流写入文本文件
        FileWriter writer = new FileWriter(fileName);

        long size = getFileSize(file, writer);
        System.out.println("fileSize: "+formatFileSize(size) + "bytes" );
    }

    private static long getFileSize(File file, FileWriter writer) throws IOException {
        if(file.isFile()){
//            writer.write("单文件"+ file.getName() +"Size：" + formatFileSize(file.length())+ "\r\n");
            return file.length();
        }else {
            long size = 0;
            File[] listFiles = file.listFiles();
            if(listFiles!=null){
                for (File f :listFiles) {
//                    if(file.length() >1011){
//                        writer.write("复合文件"+ file.getName() +"Size" +   formatFileSize(file.length())+"\r\n");
//                    }
                    size+= getFileSize(f, writer);
                }
            }
            if(size> 107374182){
                writer.write("复合文件"+ file.getName() +"Size:" +   formatFileSize(size)+"\r\n");
            }
         return  size;
        }
    }

    /**
     * 转换文件大小 显示对应 G
     * @param size
     * @return
     */
    private static String formatFileSize(long size) {
        DecimalFormat df = new DecimalFormat("#.00");
        String fileSizeString = "";
        if(size < 1024){
            fileSizeString = df.format((double) size ) + "B";
        } else if (size < 1048576) {
            fileSizeString = df.format((double) size / 1024) + "K";
        } else if (size < 1073741824) {
            fileSizeString = df.format((double) size / 1048576) + "M";
        }else {
            fileSizeString = df.format((double) size / 1073741824) + "G";
        }
        return  fileSizeString.endsWith("G")? fileSizeString: "null";
    }


    private static void RenameAllFiles() {
        File root = new File("D:\\Git file\\studyProject\\src\\javabasic\\attachments\\JVM");
        // 指定要保存文件名的文本文件路径  I:\10.txt K:\番号\MOODYZ\miaa\新建文件夹
        String fileName = "D:\\Git file\\studyProject\\src\\javabasic\\attachments\\MySQL";
        try {
            // 创建输出流写入文本文件
            FileWriter writer = new FileWriter(fileName);
            // 递归遍历目录并将文件名写入文本文件中
            listFiles(root,writer);
            // 关闭输出流
            //writer.close();
            // 输出成功信息
            System.out.println("文件名已保存至：" + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveAllFiles() {
        // 指定要遍历的磁盘目录
        File root = new File("K:\\电影\\碟中谍四部合集.1996-2011.中英字幕￡CMCT暮雨潇潇");
        // 指定要保存文件名的文本文件路径  I:\10.txt K:\番号\MOODYZ\miaa\新建文件夹
        String fileName = "K:\\电影\\10.txt";
        try {
            // 创建输出流写入文本文件
            FileWriter writer = new FileWriter(fileName);
            // 递归遍历目录并将文件名写入文本文件中
            listFiles(root,writer);
            // 关闭输出流
            writer.close();
            // 输出成功信息
            System.out.println("文件名已保存至：" + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void FilterDuplicateFileName() {
           String inputFilePath = "I:\\L.txt"; // 指定输入文本文件路径
//                String kputFile = "I:\\k.txt";
//                String eputFile ="I:\\L.txt";
//                inputFilePath.concat(kputFile);
//                inputFilePath.concat(eputFile);
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

    private static void listFiles(File dir, FileWriter writer) throws IOException {
        String duplicateName = "Pasted image ";
        // 获取目录下的所有文件和文件夹
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                // 如果是文件，则将文件名写入文本文件中
                if (file.isFile()) {
                    if (file.getName().endsWith(".mp4") || file.getName().endsWith(".mkv")
                            || file.getName().endsWith(".wmv")
                            || file.getName().endsWith(".avi")
                            || file.getName().endsWith(".mov")) {
                        writer.write(file.getName() + "\r\n");

                        // 文件重命名方法
//                    if (file.getName().contains(duplicateName)) {
//                            String newFileName = file.getName().replace(duplicateName,"");
//                            File newFile = new File(dir + "/" + newFileName);
//                            file.renameTo(newFile);
//                    }

                    }// 如果是文件夹，则递归调用自身遍历该文件夹
                    else if (file.isDirectory()) {
                        listFiles(file, writer);
                    }
                }
            }
        }}

}
