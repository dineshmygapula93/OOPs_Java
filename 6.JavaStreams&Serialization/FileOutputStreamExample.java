//Program to copy data from one file to another file using FileOutputStream
import java.io.*;
public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
            //To open a file for reading fileinputstream is used
        FileInputStream fis=new FileInputStream(args[0]);
        int n=fis.available();
        byte[] b=new byte[n];
        fis.read(b);
              //To open a file for writing fileoutputstream is used
        FileOutputStream fos=new FileOutputStream(args[1]);
        fos.write(b);

        fis.close();
        fos.close();
        }catch(IOException ie){
            System.err.println(ie);
        }
    }
}
