interface TestE{
    void add(int a,int b);
}
public class LambdaExpressionEx2 {
    public static void main(String[] args) {
        TestE t=(a,b)->System.out.println(a+b);
        t.add(23,23);
    }
}
