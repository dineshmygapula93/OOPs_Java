//Default methods in Interface:-
//                  This feature allows to write concrete instance methods in interface by using default keyword
interface Test{
    default void show(){
        System.out.println("This concrete method in the interface");
    }
}
public class DefaultMethodsInInterface implements Test{
    public static void main(String[] args) {
        Test t=new DefaultMethodsInInterface();
        t.show();
        
    }
}
