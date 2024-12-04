public class HandlingMultipleExceptionsWithSingleCatchBlock {
        public static void main(String[] args) {
            try {
                int a=Integer.parseInt(args[0]);
                int b=Integer.parseInt(args[1]);
                int c=a/b;
                System.out.println(c);
            } catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException ae) {
                System.err.println("please pass two numbers only or two arguments or second number except zero");
            }
        }
}