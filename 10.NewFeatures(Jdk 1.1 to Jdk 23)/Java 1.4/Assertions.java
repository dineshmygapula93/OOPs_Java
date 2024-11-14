/*
 * Assertions:-
 *      An assertion is a condition that must be true during program execution
 *      Assertions are used to  identify logical errors
 *      It is mainly used for testing purpose.
*   There are two ways to use assertions.
    1) assert expression;
    2) assert expression1 : expression2;

    By default assertions are disabled
    To enable assertions,use the following:
    c:\>java -enableassertions <classname>
    c:\>java -ea <classname>
 */
import java.util.Scanner;

public class Assertions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number between 1-10");
        int a=sc.nextInt();
        assert((a>0)&&(a<=10));
        System.out.println(a);
    }
}
