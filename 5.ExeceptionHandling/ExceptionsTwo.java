public class ExceptionsTwo {
    public static void main(String[] args) {
        try {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println(c);
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.err.println("please pass two arguments");
        }catch(NumberFormatException ne){
            System.err.println("please pass two numbers only");
        }catch(ArithmeticException ae){
                System.err.println("please pass second number except zero");
        }
    }
}
