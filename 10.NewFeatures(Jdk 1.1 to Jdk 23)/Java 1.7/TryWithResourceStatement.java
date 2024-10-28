/*Try with resource statment:-
 *          This feature allows to write a resource with try block.
 *  A class that implements java.io closeable interface or java.lang.Autocloseable interface can only be used as a resource 
 *  This specified resource automatically closed even exception occurs in program
 * This feature introduced in jdk 1.7
 * It is an alternative to a finally block
 */
import java.io.*;
public class TryWithResourceStatement {
   public static void main(String[] args) {
    try(FileInputStream fis=new FileInputStream(args[0])){
        int n=fis.available();
        byte[] b=new byte[n];
        fis.read(b);
        String s=new String(b);
        System.out.println(s);
    }catch(Exception e){
        System.err.println(e);
    }
   } 
}
