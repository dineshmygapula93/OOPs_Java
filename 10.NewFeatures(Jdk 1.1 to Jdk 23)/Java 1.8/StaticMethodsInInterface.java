/* Static methods in interface:-
 *                This feature allows to write concrete class methods in interface.
 */
interface Test{
    static void show(){
        System.out.println("This concrete class method in the interface");
    }
}
public class StaticMethodsInInterface implements Test{
    public static void main(String[] args) {
        Test.show();
        
    }
}
