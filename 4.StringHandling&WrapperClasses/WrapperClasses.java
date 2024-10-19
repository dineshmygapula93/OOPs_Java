/*Wrapper Classes:-
 *          Each of java's 8 primitive data types has a class & those class are called as Wrapper classes
 *  because they wrap the data into objects
                        Primitive         Wrapper Classes
                        byte              Byte
                        short             Short
                        int               Integer
                        long              Long
                        float             Float
                        double            Double
                        char              Character
                        boolean           Boolean
            The above all classes are present in the java.lang packages
    Autoboxing:-
            The process of converting primitive data type to corresponding reference data type is called as Autoboxing
            ex:-
                int x=10;
                Integer i=x;
    Autounboxing:-
            The process of converting primitive data type to corresponding reference data type is called as Autoboxing
            ex:-
                Integer x=10;
                int i=x;
    Note:-Both autoboxing and AutoUnboxing are introducded in jdk 1.5 version in 2004

 */
public class WrapperClasses {
    public static void main(String[] args) {
        int a=10;
        Integer x=a;
        System.out.println(x);

        Integer b=9;
        int y=b;
        System.out.println(y);
    }
    
}
