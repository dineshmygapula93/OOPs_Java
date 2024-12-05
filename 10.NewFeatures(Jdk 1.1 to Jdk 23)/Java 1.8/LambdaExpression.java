/*Lambda Expression:-
 *          This feature allows us to write an anonymous method in an anonymous class
 *          By using this we can reduce the code
 *          By using this feature we can implement functional programming 
 *          Functional programing means functions can be passed as an argument to another function
 */
@FunctionalInterface
interface Testc{
    int add(int a,int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        Testc t=(a,b)->(a+b);
        int x=t.add(234, 234);
        System.out.println(x);
    }
}
