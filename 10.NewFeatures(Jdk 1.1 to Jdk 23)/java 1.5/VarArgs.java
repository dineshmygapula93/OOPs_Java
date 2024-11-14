/*
 * Varargs:-
 *      It means Variable Arguments.
        It allows to pass 0 to any number of arguments to a method.
        There can be only one variable argument in the method.
        Variable argument (varargs) must be the last argument.
 */
public class VarArgs {
    //Below arugment int..a is called as variable arugument
    void add(int...a){
        int c=0;
        for (int b : a) {
           c+=b;
        }
        System.out.println(c);
        }
    public static void main(String[] args) {
        VarArgs va=new VarArgs();
        //Any numbers arguments can be accepted by add method
        va.add(1,2,3);
        va.add(1,2,3,4,5,6,7,8,9);
        va.add(1,2,3,4,5,6,7,8,9,9,9,8,9,9);
        
    }
}
