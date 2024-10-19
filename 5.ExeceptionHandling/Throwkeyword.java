//throw:-It passes the object of exception class to a catch block
//It used create user defined exceptions
class NegativeNumberException extends RuntimeException{

}

public class Throwkeyword {
    void cube(int a){
        if(a>0){
            System.out.println(a*a*a);
        }else{
           throw new NegativeNumberException();
        }
    }
    public static void main(String[] args) {
        try{
            int b=Integer.parseInt(args[0]);
            Throwkeyword tk=new Throwkeyword();
            tk.cube(b);
        }catch(NegativeNumberException ne){
            System.err.println(ne);
        }
    }
}