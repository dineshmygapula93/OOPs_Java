/*Enumerations
            * This feature allows us to create a new data type in Java.
            The Enum in Java is a data type which contains a fixed set of constants.
            The Java enum constants are public, static and final implicitly.
            we can define an enum either inside the class or outside the class.
            We can have fields, constructors, methods, and main methods in Java enum.

Note: Java compiler internally adds values(), valueOf() and ordinal() methods within the enum at compile time.

    valuesof() method used to convert  a string into enum
 */
enum Day{
    mon,tue,wed,thu,fri,sat,sun
}
public class Enumerations {
    public static void main(String[] args) {
        Day d=Day.thu;
        System.out.println(d);
// values() method used to get all the values
        Day [] d1=Day.values();
        for (Day day : d1) {
            System.out.print(day+" ");
        }
        
    }
}
