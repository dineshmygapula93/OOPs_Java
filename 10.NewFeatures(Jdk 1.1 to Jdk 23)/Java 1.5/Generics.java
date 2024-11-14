/*
 * Generics:-
 *          This feature allows to write the type safety programs
 *  The syntax to create an object to a generic class:-
 *      classname <referencedatatype> objectreference = new classname<referencedatatype>();
 * example:-
 *          Emp<integer> e=new Emp<integer>();
 * The above code can be written frommjdk 1.7 as follows:-
 *          Emp<integer> e=new Emp<>();
 *  This feature allows to decide a data type while creating the object
 */
public class Generics<T> {
    T empNo;
    String name;
    Generics(T empNo,String name){
        this.empNo=empNo;
        this.name=name;
    }
    public static void main(String[] args) {
        Generics<Integer> g=new Generics<Integer>(101,"Dinesh");
        System.out.println(g.empNo+" : "+g.name);
        Generics<String> g1=new Generics<String>("ABC","Dinesh");
        System.out.println(g1.empNo+" : "+g1.name);
    }
}
