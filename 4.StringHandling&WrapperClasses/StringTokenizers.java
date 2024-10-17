/*StringTokenizer:-
 *          It allows an application to break String into tokens(words)
 */
import java.util.*;
public class StringTokenizers {
    public static void main(String[] args) {
        String s="welcome to the java programming";
        StringTokenizer sk=new StringTokenizer(s);
//CountToken method counts the number of tokens
        int n=sk.countTokens();
        System.out.println(n);
//hasMoreTokens method checks whether tokens are their or not
        while (sk.hasMoreTokens()) {
            //nextToken() method returns the current token and moves to next token
            System.out.println(sk.nextToken());
        }
    }
}
