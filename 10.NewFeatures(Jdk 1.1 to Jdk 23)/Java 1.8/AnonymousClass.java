/*Anounymous Class:-
 *      A class that is defined without name is called as an anonymous class
 *      Anonymous class is always inner class only.
 *      An anonymus class is always subclass of a class or interface
 */
@FunctionalInterface
interface TestB{
    int add(int a,int b);
}
class AnonymousClass {
   public static void main(String[] args) {
       TestB b=new TestB(){
           public int add(int a,int b){
               int c=a+b;
               return c;
            }
        };
      int x= b.add(334,334);
        System.out.println(x);
       }
}
