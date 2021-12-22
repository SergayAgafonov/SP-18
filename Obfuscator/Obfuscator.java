package Obfuscator;

import java.io.*;
public class Obfuscator {
    public static void main(String[] args) {
        Metod();}

    public static void Metod(){
        try(BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\main\\src\\Obfuscator\\file1.txt"))){
            String cod;
            boolean mnog = false;
            while ((cod = read.readLine()) != null){
                cod = cod.replaceAll("\\s*", ""); // Удаляет пробелы
                boolean Comment = cod.matches("^(//.*)|(.*/\\*.*)|(.*\\*/)$"); // Регулярное выражение удаляет комментарии
                if(Comment){
                    boolean comment = cod.matches("^(.*\\*/)$"); // Регулярное выражение для начала многострочного комментариев
                    boolean comment_2 = cod.matches("^(.*/\\*.*)$"); // Регулярное выражение для конца многострочного комментариев
                    if(comment){ // Проверяет на начало многострочного комментария
                        mnog = false;}
                    else if (comment_2){ // Проверяет на конец многострочного  комментария
                        mnog = true;}
                    else{
                        mnog = false;}
                }
                else if (!mnog){
                    Preobr(cod);}}}
        catch (IOException ex) {
            System.out.println(ex.getMessage());}}

    public static void Preobr(String cod){ // Этот метод нужен для записи преобразованного кода в файл
        try(BufferedWriter wr = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\IdeaProjects\\main\\src\\Obfuscator\\itog.txt", true))){
            wr.write(cod);}
        catch (IOException ex) {
            System.out.println(ex.getMessage());}}
}