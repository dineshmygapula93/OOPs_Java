/*Local Variable Type Inference:-
                This feature allows to store any type of the data in a var type variable.
 *              This feature  can be used to local Variable only
 */
public class LocalVariableTypeInference {
    public static void main(String[] args) {
        var a=100;
        var b=32232.32f;
        var c="dinesh";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

// var a=10;
// System.out.println(a);
// a=2323.32f;  -> Here it is error
// System.out.println(a);
// Note:- Here Once type is decided then it cannot be changed