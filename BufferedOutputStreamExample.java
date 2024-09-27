import java.io.*;
import java.util.*;


public class BufferedOutputStreamExample{
    public static void main(String[] args)
    throws Exception
    {
        FileOutputStream fout=new FileOutputStream("D:\\xyz.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String: ");
        String s = buf.readLine();
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
    }
}