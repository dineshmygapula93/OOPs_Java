import java.util.function.*;

public class PredefinedConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> f=s->System.out.println(s);
        f.accept("Welcome to java programming");
    }
}
