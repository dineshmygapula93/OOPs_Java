//HAS_Relationship refers composition
//Creating an object of one class as a member of another class
class HS{
    void display(){
        System.out.println("i am method of one class");
    }
}
public class HASrelationship {
    HS B=new HS();
    public static void main(String[] args) {
        HASrelationship A=new HASrelationship();
        A.B.display();
    }
}
