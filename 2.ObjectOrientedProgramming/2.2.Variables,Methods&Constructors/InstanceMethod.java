//A group of statements into a single logical unit is called as method
//A method that is defined as a member of a class is known as instance method
//A instance method can be accessed by object(anonymus object) or object reference
public class InstanceMethod {
    int add(int a,int b){
        int c=a+b;
        return c;
    }
        public static void main(String [] args) {
            InstanceMethod obj= new InstanceMethod();
            int x=obj.add(4, 5);
            System.out.println(x);
        }
}
