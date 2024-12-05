@FunctionalInterface
interface TestD{
    void show();
}
public class LambdaExpressionEx1 {
    public static void main(String[] args) {
        TestD t=()->System.out.println("i am anonyms method");
        t.show();
    }
}
