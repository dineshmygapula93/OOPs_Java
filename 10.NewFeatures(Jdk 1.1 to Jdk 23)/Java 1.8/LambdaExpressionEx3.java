@FunctionalInterface
interface TestF{
    int get();
}
public class LambdaExpressionEx3 {
    public static void main(String[] args) {
        TestF t=()->10;
        int x=t.get();
        System.out.println(x);
    }    
}