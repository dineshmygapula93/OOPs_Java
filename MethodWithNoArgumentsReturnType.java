//The method having no arguments and return type
public class MethodWithNoArgumentsReturnType {
 //Here add method have the No arguments and int is the return type
 int add(){
    int a=3;
    int b=4;
    int c=a+b;
    return c;
}
    public static void main(String [] args) {
        MethodWithNoArgumentsReturnType obj= new MethodWithNoArgumentsReturnType();
        int x=obj.add();
        System.out.println(x);
    }
   
}