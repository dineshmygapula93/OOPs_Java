//An Object is a Instance of class
public class ObjectCreation {
    void display(){
        System.out.println("hello i am display method");
    }
    public static void main(String[] args) {
        //It Oject created with name of class & new is keyword for dynamic memory allocation
        ObjectCreation ob=new ObjectCreation();
        ob.display();
    }
}
