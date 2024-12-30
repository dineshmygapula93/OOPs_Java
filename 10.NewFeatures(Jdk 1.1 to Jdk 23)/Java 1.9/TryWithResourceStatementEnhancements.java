/*Try With Resource Statement Enhancements:-
 *          This feature allows to write a try with resource Statement on a new way
 */

import java.io.*;

public class TryWithResourceStatementEnhancements {
      public static void main(String[] args)throws FileNotFoundException {
        FileInputStream fis=new FileInputStream(args[0]);
        try(fis)
        {
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
