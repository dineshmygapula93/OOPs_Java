import java.util.function.*;

public class PredefinedBinaryOperatorInterface {
    public static void main(String[] args) {
        BinaryOperator<Integer> f=(a,b)->a>b?a:b;
        int x=f.apply(3, 5);
        System.out.println(x);
    }
}
