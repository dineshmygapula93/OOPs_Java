//ISA-Relationship refers inheritance
//Creating new class from existing class is called as inheritance
class ISA{
    void display(){
        System.out.println("i am the super class method");
    }
}
public class ISArelationship extends ISA{
    public static void main(String[] args) {
        ISArelationship is=new ISArelationship();
        is.display();
    }
}
