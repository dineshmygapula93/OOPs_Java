import java.util.function.*;

public class PredefinedSupplierInterface {
    public static void main(String[] args) {
        Supplier<Integer> f=()->10;
        int a=f.get();
        System.out.println(a);
    }
}
