//Static imports:-
//             This feature allows to avoid class name with static members while accesing static members

import static java.lang.Integer.*;
//This statement allows to access all static members of java.lang.Integer class without class name
import static java.lang.System.*;
//This statement allows to access all static members of java.lang.System class without class name
public class StaticImports {
    public static void main(String[] args) {
        int x=parseInt(args[0]);
        int y=parseInt(args[1]);
        out.println(x+y);
    }
}
