//The method having arguments and no return value  
public class MethodWithArgumentNoReturnValue {
   // Here add method have the two arguments and no return value
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
        public static void main(String [] args) {
            MethodWithArgumentNoReturnValue obj= new MethodWithArgumentNoReturnValue();
           obj.add(4, 5);
        }
}
