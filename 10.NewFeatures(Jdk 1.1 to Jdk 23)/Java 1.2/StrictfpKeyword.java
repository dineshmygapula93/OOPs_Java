/*
 * Strickfp :-
 *          strictfp is a keyword and it is used to restrict floating-point calculations and
            ensuring same result on every platform while performing operations.
       
        strictfp modifier is used with classes, interfaces and methods only.
        strictfp modifier can be used with main() method also.
       
        When a class or an interface is declared with strictfp modifier, then all methods
        declared in the class/interface are implicitly strictfp.
       
        strictfp cannot be used with abstract methods, variables & constructors.
        It can be used with abstract classes/interfaces.
 */
public class StrictfpKeyword {
    strictfp public static void main(String[] args) {
        float a=1324.3332f;
        float b=122122.1212f;
        float c=a+b;
        System.out.println(c);
    }
}

//Note:- JDK 17 onwords all floating point numbers strictly evaluated.
//       It does not requried to write strictfp keyword expicitly