//Polymorphism :- The ability to take more than one form is called Polymorphism
//Poly means many ,morphism means forms & Polymorphism means many forms
//There are two types of polymorphisms 1)Compile time Polymorphism 2)Run time polymorhism

/* Compile Time Polymorphism:-
    Binding of method call statements with method defination at the compile time is know as Compile Time Polymorphism.
    Here compile time polymorphism refers method overloading

    Method overloading:-
        If two or more methods with same name and different parameters list then its is said to be Method overloading
        Different parameters can be in no of arguments,data types or order of the arguments
        In method overloading return type can be same or different 
*/

public class CompileTimePolymorphism {
    
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        CompileTimePolymorphism cp =new CompileTimePolymorphism();
        cp.add(5,4);
        cp.add(32,23,34);
    }
}


// Final methods can be overloaded
// Static methods can be overloaded
// Private methods can be overloaded
//Methods can be overloaded in the same class
//Methods can be overloaded in the in the inheritances also