@FunctionalInterface
interface TestK{
    int add(int a,int b);
}
public class ClassMethodReference {
    static int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        
        TestK t=ClassMethodReference::add;
        int x=t.add(324,234);
        System.out.println(x);
    }
}
