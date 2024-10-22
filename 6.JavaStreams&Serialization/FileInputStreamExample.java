//program to read the data from file by using FileInputStream class
import java.io.*;
public class FileInputStreamExample {
    public static void main(String[] args) {
        try{

        FileInputStream fis=new FileInputStream(args[0]);
        //available() is used to return the file size
        int n=fis.available();
        byte[] b=new byte[n];
        fis.read(b);
        String s=new String(b);
        System.out.println(s);
        fis.close();
        }catch(IOException ie){
            System.err.println(ie);
        }
    }
}
