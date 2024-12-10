/*Private Methods in  Interface:-
 *  This feature allows to write the private methods in the Interface.
 */
interface Test{
    private void show(){
        System.out.println("i am private methpd");
    }

    default void print(){
        show();
        System.out.println("i am default method");
    }
}
public class PrivateMethodsInInterface implements Test{
    public static void main(String[] args) {
        Test t=new PrivateMethodsInInterface();
        t.print();    
        
    }
}