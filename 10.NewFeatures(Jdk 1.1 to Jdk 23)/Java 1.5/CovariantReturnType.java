//Covariant return type :- Java permits the sub class type as a return type while overriding a method.
//                          This is know as covariant return type
class A{
    A get(){
        System.out.println("It is super class");
        return this;
    }
}
public class CovariantReturnType extends A{
    CovariantReturnType get(){
        System.out.println("It is sub class");
        return this;
    }
    public static void main(String[] args) {
        CovariantReturnType B=new CovariantReturnType();
        B.get();
    }
}
