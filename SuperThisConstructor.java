//Example for constructor using super and this keyword
class TC{
    TC(){
        this(20);
        System.out.println("i am default constructor of super class");
    }
    TC(int y){
        System.out.println(y);
    }
}
public class SuperThisConstructor extends TC {
    SuperThisConstructor(){
        this(10);
        System.out.println("i am default constructor of subclass ");
    }
    SuperThisConstructor(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        new SuperThisConstructor();
    }
}
