//Super keyword is called as object reference or reference variable because it refers super class memory
//It is explicitly requried when the super class members and sub class members names are same.Here member can be variable or method
class SA{
    int x=10;
}
public class SuperKeyword extends SA{
int x=20;
void print(){
    int x=30;
    System.out.println(x);
    //Here x with this keyword refers sub class members
    System.out.println(this.x);
    //Here x with super keyword refers super class members
    System.out.println(super.x);
}
public static void main(String[] args) {
    SuperKeyword sk=new SuperKeyword();
    sk.print();
}
}
//Static keyword does not refer this & super keyword in any way