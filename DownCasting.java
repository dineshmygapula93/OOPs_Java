//Assigning object or object reference of super class to sub class type is known as Upcasting
//DownCasting must be done by the programmer explicitly otherwise compile time error occurs
//DownCasting always needs Upcasting to get memory  
class DC{
    void show(){
        System.out.println("i am super class");
    }
}
public class DownCasting extends UP{
    void show(){
        System.out.println("i am sub class");
    }
    public static void main(String[] args) {
        UP obj=new DownCasting();
        DownCasting obj2=(DownCasting)obj;
        obj2.show();
        
    }
}
