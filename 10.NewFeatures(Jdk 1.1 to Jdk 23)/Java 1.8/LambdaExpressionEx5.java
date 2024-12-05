interface TestH{
    int max(int a,int b);
}
public class LambdaExpressionEx5 {
    public static void main(String[] args) {
        TestH t=(a,b)->(a>b?a:b);
        int x=t.max(367,32);
        System.out.println(x);
    }
}
