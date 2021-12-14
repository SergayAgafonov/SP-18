package CopyFile;

import java.io.*;

class СopyFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src\\CopyFile\\test1"); //Этот файл содержит текст
        File file2 = new File("src\\CopyFile\\test2"); //В этот файл копируется текст
        copyFileUsingStream(file1, file2);
    }
    private static void copyFileUsingStream(File file1, File file2) throws IOException {
        InputStream raz = null;
        OutputStream rez = null;
        long start = System.nanoTime(); //Старт времени копирования файла
        try {
            raz = new FileInputStream(file1); //Чтение данных из файла
            rez = new FileOutputStream(file2); //Запись данных в файл
            byte[] buffer = new byte[512]; //Байтовый поток
            int length;
            while ((length = raz.read(buffer)) > 0) {
                rez.write(buffer, 0, length);
            }
        }
        finally {
            raz.close();
            rez.close();
        }
        System.out.println("Время копирования файла = "+(System.nanoTime()-start));
    }
}