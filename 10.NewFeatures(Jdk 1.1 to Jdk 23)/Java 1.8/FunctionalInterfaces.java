/* Functional Interface:-
 *          An  interface that contains only one abstract method is called as functional interfcace.
 *          Functional interface can have any number of variables.
 *          Functional interface can have any number of default methods & static methods
 *          Functional interfaces are required in the funvtional programming.
 *          Functional programming means function can return another function.
 * 
 * @FunctionalInterface Annotation :-
 *          It ensures that functional interface cannot have more that one abstract methods
 */

 @FunctionalInterface
interface Sample{
    int x=10;
    void show();
}
public class FunctionalInterfaces implements Sample{
    public void show(){
         System.out.println("i am in the main");
     }
    public static void main(String[] args) {
        Sample s=new FunctionalInterfaces();
        s.show();
    }
}
