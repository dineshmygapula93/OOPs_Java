interface TestG{
    int length(String s);
}
public class LambdaExpressionEx4 {
    public static void main(String[] args) {
        TestG t=(s)->s.length();
        int x=t.length("dinesh");
        System.out.println(x);
    }
}
