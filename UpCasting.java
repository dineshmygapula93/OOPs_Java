//Assigning object or object reference of sub class to super class type is known as Upcasting
class UP{
    void show(){
        System.out.println("i am member of super class");
    }
}
public class UpCasting extends UP {
    public static void main(String[] args) {
        //Assigning object to the super class type
        UP obj=new UpCasting(); 
        obj.show();
        //or

        UpCasting obj2 =new UpCasting();
     // Assigning object reference to the super class
        UP obj3=obj2;
        obj3.show();
    }
}
