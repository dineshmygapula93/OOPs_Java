/*Optional Class:-
 *      It is used to avoid null point exceptions
 *      This optional Class contains several methods that are used to perform operations on null values
 *      java.util.Optional<T>
 *  Methods:-
 *      public static Optional<T> of Nullable<T>;
 *      => It returns optional object it may or may not contain null
 *      public boolean isPresent();
 *      =>It return true if it contains non null values otherwise it is return false.
 */
import java.util.*;
public class OptionalClass {
    public static void main(String[] args) {
        String s[]=new String[3];
        s[0] ="javase";
        s[2] ="javaee";
        for(int i=0;i<s.length; i++){
            Optional<String> o=Optional.ofNullable(s[i]);
            if(o.isPresent()){
                System.out.println(s[i].toUpperCase());
            }else{
                System.out.println("s ["+i+"] contains null values");
            }
        }
    }    
}