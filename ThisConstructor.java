//This must be the first statement of the constructor
public class ThisConstructor {
    ThisConstructor(){
        this(10);
        System.out.println("i am default constructor of subclass ");
    }
    ThisConstructor(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        new ThisConstructor()   ;
}
}
