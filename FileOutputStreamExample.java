import java.io.*;

public class FileOutputStreamExample{
    public static void main(String[] args){
        try{
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success...");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}