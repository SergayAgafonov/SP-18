package CopyNIO;

import java.io.*;
import java.nio.channels.FileChannel;

public class  CopyNIO{
    public static void main(String[] args) throws InterruptedException, IOException {
        File file1 = new File("file1.txt"); //Данный файл содержит текст
        File inFile1 = new File("inFile1.txt"); //В этот файл копируется текст из file1
        File file2 = new File("file2.txt"); //Этот файл содержит текст
        File inFile2 = new File("inFile2.txt"); //В этот файл копируется текст из file2

        long start = System.currentTimeMillis();
        CopyInFile(file1,inFile1);
        CopyInFile(file2, inFile2);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
    public static  void CopyInFile (File file1,  File inFile1)  throws IOException {

        FileChannel is= null;
        FileChannel os = null;
        try {
            is = new FileInputStream(file1).getChannel();
            os = new FileOutputStream(inFile1).getChannel();
            os.transferFrom(is, 0, is.size()); // Здесь происходит копирование в файл
        } finally {
            is.close();
            os.close();

        }
    }
}
