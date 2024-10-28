//Static keyword is called as modifier because it modifies the behaviour of avariable,method,class & block
//By using static keyword we can create class variables,class methods,nested top level classes(it is one type of inner class)&static initialization blocks
public class StaticKeyword {
    static void show(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
    //above show method can be accessed four ways
    //1.Directly we can access
    show();
    //2.By using class name(use it when it is in another class)
    StaticKeyword.show();

    //3&4 ways are valid but not recommended to use
    //3.By using an object(anonymus object)
    // new StaticKeyword().show();
    //4.By using an object reference
   // StaticKeyword sk=new StaticKeyword();
    //sk.show();
    }
}
