//Static Member Class:-
//          A class that is defined as a static member of another class is called as static member class
public class InnerStaticMemberClass {
    static class InnerB{
       void show(){
        System.out.println("i am static inner class");
       } 
    }
    public static void main(String[] args) {
       
        InnerStaticMemberClass.InnerB outer=new InnerStaticMemberClass.InnerB();
        outer.show();
    }
}
