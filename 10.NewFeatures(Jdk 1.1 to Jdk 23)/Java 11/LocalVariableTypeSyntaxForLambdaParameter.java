/*Local Variable Type Syntax For Lambda Parameter:-
 *          This Feature allows to Write Var in lambda function
 */
@FunctionalInterface
interface Test{
    void add(int a,int b);
}
public class LocalVariableTypeSyntaxForLambdaParameter {
    public static void main(String[] args) {
        Test t=(var a,var b)->System.out.println(a+b);
        t.add(23,324);
    }
}
