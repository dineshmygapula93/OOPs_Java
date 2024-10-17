//import java.lang.*; this line is implicitly present in the every class no need to import
//Every class extends object class implicitly
//so below line is implicitly public class Demo Extends Object{} 
public class Demo{
    public static void main(String[] args) {

        String s=new String();
//The below line implicitly  System.out.println(s.toString());
        System.out.println(s);
//Here String class toString() method is called. String class toString() returns the content of String object

        Demo d=new Demo();
//The below line implicitly  System.out.println(s.toString());
        System.out.println(d);
//Here Object class toString() method is called.Object class toString() returns Classname@hashcode in HexaDecimalformat
    }
}
//Default value of String class is null