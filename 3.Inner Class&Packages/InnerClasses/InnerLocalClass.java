/*Local Class:-
        A class that is defined inside a method is called as Local class
 */
public class InnerLocalClass {  
    public static void main(String[] args) {
        class InnerInnerLocalClass {
                void show(){
                    System.out.println("i am local class");
                }
        }
    InnerInnerLocalClass inner=new InnerInnerLocalClass();
    inner.show();
    }
}