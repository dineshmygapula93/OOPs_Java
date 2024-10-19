//Using throws keyword
//throws:-It is used to apply an exception to a method & it is also used to handle exception without try & catch methof
public class ThrowsException {
    void cube(int a){
        System.out.println(a*a*a);
    }
    public static void main(String[] args) throws NumberFormatException {
        ThrowsException te=new ThrowsException();
        int b=Integer.parseInt(args[0]);
        te.cube(b);

    }
}
