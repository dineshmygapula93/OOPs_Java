//The method having arguments and no return type   
public class MethodWithArgumentNoReturn {
   // Here add method have the two arguments and no return
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
        public static void main(String [] args) {
            MethodWithArgumentNoReturn obj= new MethodWithArgumentNoReturn();
           obj.add(4, 5);
        }
}
