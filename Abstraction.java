/*Abstraction:-
        Providing necessory information and hidding unnecessary information is called Abstraction
        In Java,Abstraction can be implemented by using Abstract class and interfaces
    Abstract class:-
        A class that is declared with Abstract keyword is called Abstract class
        Abstract class can have Abstract methods & non Abstract methods or both Abstract methods & non Abstract methods
    Abstract method:-
        A method that has no body is called as an abstract method.
        A Abstract method is declared with abstract keyword in java otherwise compile time error occurs
        Non Abstract method is called as concrete method
    Concreate method:-
        A method which has body is called concrete method
    If the class contains abstract method then class must declared with abstract keyword
    Abstract class can be inherited
    When ever abstract class is inherited then all abstract method of an abstract class must be overridden in a sub class
    or sub class must be declared with abstract keyword otherwise compile time error occurs
 */
abstract class AB{
    abstract void display();
}
public class Abstraction extends AB {
    void display(){
        System.out.println("i am sub class");
    }
    public static void main(String[] args) {
        Abstraction as=new Abstraction();
        as.display();
    }
}   

//Abstract methods can't be final
//Abstract methods can't be Static
//Abstract methods can't be private
//Abstract classes can have constructors
//Abstract classes can have static member variables and methods