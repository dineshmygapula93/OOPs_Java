/*Method Reference:-
 *       This feature allows to create a reference to  an instance method & class method.
 *       It is an alternative to lambda expression.
 */
@FunctionalInterface
interface TestJ{
    int add(int a,int b);
}
public class MethodReference {
    int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        MethodReference mf=new MethodReference();
        TestJ t=mf::add;
        /*
         * we can write above two lines as follows
         *   TestJ t=new MethodReference::add; 
         */
        int x=t.add(32, 233);
        System.out.println(x);
    }
}
