//A variable that is defined as the static member of class is called as Classvariable
//Memory is allocated to class vairable when the class is loaded
//class variable is stored in the method area
class A{
    static int y=4;
}
public class ClassVariable {
    static int x=5;
    public static void main(String[] args) {
        //we can access class variable when it is in same class
        System.out.println(x);
        //Accessing class variable with class name because it is in another class
        System.out.println(A.y);
    }
}
