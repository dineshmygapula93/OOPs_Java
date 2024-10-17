class MA{
    void display(){
        System.out.println("level once");
    }
}
class MB extends MA{
    void print(){
        System.out.println("level second");
    }
}
public class MultilevelInheritance extends MB {
    public static void main(String[] args) {
    MultilevelInheritance ml=new MultilevelInheritance();
    ml.display();
    ml.print();
      
    }
}

//java does not support multiple inheritance ,multipart inheritance and hybrid inheritance(which include multiple inheritance)
//Because of ambiguity to call
//To support the multiple inheritance ,multipart inheritance and hybrid inheritance use abstract method in interface