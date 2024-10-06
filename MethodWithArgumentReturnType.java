//The method having arguments and return type
public class MethodWithArgumentReturnType {
    //Here add method have the two arguments and int is the return type
    int add(int a,int b){
        int c=a+b;
        return c;
    }
        public static void main(String [] args) {
            MethodWithArgumentReturnType obj= new MethodWithArgumentReturnType();
            int x=obj.add(4, 5);
            System.out.println(x);
        }
    }
