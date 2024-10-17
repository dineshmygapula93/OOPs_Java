/*
 * Anonymus class:-
 *          It is a one type of inner class which has no name
 *          It is always subclass of a class or interface
 */
interface TestA{
    void show();
}
public class AnonymusClass {
    public static void main(String[] args) {
        
    TestA t=new TestA(){
       public void show(){
            System.out.println("i am Anonymus class");
        }
    };
    t.show();  
}
}
