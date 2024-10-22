//program to demonstrate input stream
import java.io.*;
public class InputStreamexample {
    public static void main(String[] args) {
        try{
        byte[] b=new byte[10];
        System.out.println("enter any number");
        System.in.read(b);

        String s1=new String(b);
        //trim method is used to remove extra spaces
        String s2=s1.trim();

        int a=Integer.parseInt(s2);

        System.out.println(a);
        }catch(IOException ie){
            System.err.println(ie);
        }
    }
}
