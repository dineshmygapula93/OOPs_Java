//The method having arguments and return value
public class MethodWithArgumentReturnValue {
    //Here add method have the two arguments and int is the return value
    int add(int a,int b){
        int c=a+b;
        return c;
    }
        public static void main(String [] args) {
            MethodWithArgumentReturnValue obj= new MethodWithArgumentReturnValue();
            int x=obj.add(4, 5);
            System.out.println(x);
        }
    }
