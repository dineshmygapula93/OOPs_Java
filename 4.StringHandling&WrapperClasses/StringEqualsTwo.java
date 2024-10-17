public class StringEqualsTwo {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";

        System.out.println(s1.equals(s2));

        System.out.println(s1==s2);
    }
}
/*
 *  the duplicate are not created in string pool so one Constant String pool is created
 */
