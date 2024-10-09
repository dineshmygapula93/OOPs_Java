//super() calls the default constructor of super class
//super(arg1,arg2) calls the parameterized constructor of super class
//super is implicitly present in the first line of constructor
class SC{
    SC(){
        System.out.println("i am constructor of super class");
    }
}
public class SuperForConstructors extends SC{
    SuperForConstructors(){
        System.out.println("i am constructor of sub class");
    }
    public static void main(String[] args) {
        new SuperForConstructors();
    }
}
