//Creating a new class from an existing class is called as inheritance
//In inheritance existed class(parent class) is said to be super class and new class(child class) is said to be sub class
//Whenever super class object is created then memory is allocated to super class members only
//Whenever sub class object is created then memory is allocated to both super class & sub class members
class Ab{
    void show(){
        System.out.println("i am from class a");
    }
}
public class Inheritance extends Ab{
        void display(){
            System.out.println("i am sub class");
        }
    public static void main(String[] args) {
        Inheritance ob=new Inheritance();
        ob.show();
        ob.display();
    }
}
//It is example of Single Inheritance
