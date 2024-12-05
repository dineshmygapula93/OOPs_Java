import java.util.function.*;
public class PredefinedPredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> f=a->a%2==0;
        boolean b=f.test(5);
        if(b){
            System.out.println("Even number");
        }else{
            System.out.println("odd Number");
        }
    }   
}
