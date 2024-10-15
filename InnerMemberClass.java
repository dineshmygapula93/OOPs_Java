/*
 * Inner class:-
 *          A class that is defined in another class is called as an inner class
 *          There are four types of inner classes
 *          1.Member class
 *          2.static member class
 *          3.Local class
 *          4.Anonymus class
 * Member class:-
 *       A class that is defined as member of another class is called as member class
 */
public class InnerMemberClass {
    class InnerA{
        void show(){
            System.out.println("i am inner class");
        }
    }
    public static void main(String[] args) {
        InnerMemberClass outer=new InnerMemberClass();
        InnerMemberClass.InnerA inner=outer.new InnerA();
        inner.show();
    }
}