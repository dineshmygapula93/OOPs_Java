//Final is called as modifier because it modifies the behaviour of variable,method and class
//By using final keyword,we can prevet value of variable,method overriding and inheritance.
//If we write final keyword before class then the class will not inherited 
class FK{
    //final method cannot overridden
    final void display(){
        System.out.println("i am in final method");
    }
}
public class FinalKeyword extends FK{
    //final variable must be initialized otherwise compile time error occurs because final variable will not get default value
    final int x=10;
    public static void main(String[] args) {
        FinalKeyword fk=new FinalKeyword();
        System.out.println(fk.x);
        fk.display();
    }
}
