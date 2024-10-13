/*
 * Interface:-
 *      An interface is a collection of public static final variables and public abstract methods.
 *      In interfaces all variables are implicitly public static final & all methods are implicitly public abstract
 *      Interface can be inherited into a class by using implements keyword
 *      Interface can be inherited into a interface by using extends keyword
 *      When ever interface is inherited then all abstract method of an interface must be overridden in a sub class
 *      or sub class must be declared with abstract keyword otherwise compile time error occurs
 *      Interfaces are introduced in java to achieve multiple inheritance
 */
interface Test{
    int x=10;
    void show();
}
public class Interfaces implements Test{
    public void show(){
        System.out.println("i am sub class");
    }
    public static void main(String[] args) {
        Interfaces obj=new Interfaces();
        System.out.println(x);
        obj.show();
    }
}
//Interfaces can be instantiated means object creation
//