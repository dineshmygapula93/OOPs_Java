//The Constructor without arguments is called Default Constructor
//If the class does not contain any constructor then only java compiler implicitly provides one default constructor
public class DefaultConstructor {
    DefaultConstructor(){
        System.out.println("i am default constructor");
    }
    public static void main(String[] args) {
        new DefaultConstructor();
    }
    
}
