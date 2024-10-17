public class StringConcate {
    public static void main(String[] args) {
        String s1="Dinesh";
        String s2="mygapula";

        System.out.println(s1.concat(s2));
        System.out.println(s1+s2);
        s1=s1.concat(s2);
//In above line value of String object is not changed ,hashcode is changed because the object of String class is immutable
        System.out.println(s1);
    }
}
