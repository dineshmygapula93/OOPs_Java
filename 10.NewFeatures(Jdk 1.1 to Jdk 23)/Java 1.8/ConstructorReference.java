/*Constructor Reference:-
 *      This feature allows to create a reference to a constructor.
 */
interface TestL{
    void add(int a,int b);
}
public class ConstructorReference {
    ConstructorReference(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        TestL t=ConstructorReference::new;
        t.add(32,23);
    }
}
