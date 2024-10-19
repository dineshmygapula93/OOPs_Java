//Finally block:- It used to perform cleanup activity
//Cleanup Activities are closing a file,closing a database connection,closing socket
//finally block is excuted even exception occurs in program

import java.util.*;
public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter any line");
        String s=sc.nextLine();
        System.out.println(s);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            sc.close();
        }
    }
}
