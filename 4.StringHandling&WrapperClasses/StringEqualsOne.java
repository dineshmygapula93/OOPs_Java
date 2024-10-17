public class StringEqualsOne {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");

        System.out.println(s1.equals(s2));

        System.out.println(s1==s2);
        
//equals() method of String class compares the contents of String objects whereas == operator compares the hash codes.
    }
}
/*
 *   In this example String s=new String() line creates two objects their are String object and String Constant pool
 * But the above example the duplicate are not created in string pool so one Constant String pool and
 *  two String objects are created 
 * it compare two String objects
 */
