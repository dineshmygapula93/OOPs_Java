class SM{
    void show(){
        System.out.println("i am from super");
    }
}
public class SuperForMethods extends SM {
    void show(){
        System.out.println("i am from sub");
    }  
    void print(){
        show();
        this.show();
        super.show();
    } 
    public static void main(String[] args) {
        SuperForMethods sfm=new SuperForMethods();
        sfm.print();
    }
}
