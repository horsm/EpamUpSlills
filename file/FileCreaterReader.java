package file;

import java.io.*;

public class FileCreaterReader {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");

        if (!file.exists()) {
           // file.mkdir();
            file.createNewFile();
        } else System.out.println("Created");

//        if (file.isDirectory()) {
//            System.out.println("dir");
//        } else if (file.isFile()) {
//            System.out.println("file");
//        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("qwe1\n");
        fileWriter.write("qwe2\n");
        fileWriter.write("qwe3\n");
        fileWriter.write("qwe4\n");

//        fileWriter.flush();
//        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        char[] chars = new char[20];
        fileReader.read(chars);
        System.out.println(chars);


        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("asd5");
        bufferedWriter.newLine();
        bufferedWriter.write("asd6");
        bufferedWriter.newLine();
        bufferedWriter.write("asd7");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }










    }
}
