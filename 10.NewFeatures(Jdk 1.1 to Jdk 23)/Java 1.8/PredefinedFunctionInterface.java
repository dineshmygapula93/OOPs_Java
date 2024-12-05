import java.util.function.*;
public class PredefinedFunctionInterface {
    public static void main(String[] args) {
        Function<String ,String> f=s->s.toUpperCase();
        String s=f.apply("dinesh");
        System.out.println(s);
    }
}
