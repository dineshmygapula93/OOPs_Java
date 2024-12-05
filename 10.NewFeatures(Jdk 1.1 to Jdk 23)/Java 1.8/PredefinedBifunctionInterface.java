import java.util.function.*;

public class PredefinedBifunctionInterface {
    public static void main(String[] args) {
        BiFunction<Byte ,Short ,Integer> f=(a,b)->(a+b);
        Byte a=1;
        Short b=4;
        int x=f.apply(a, b);
        System.out.println(x);
    }
}
