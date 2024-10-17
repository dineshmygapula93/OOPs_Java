public class StringClass {
    public static void main(String[] args) {
        //Here only one ojbject is created in String Constant pool
        String s1="welcome";

        //Here two objects are created one is in String Constant pool and another in outside the pool
        String s2=new String("welcome");
        //Duplicate values are not created in String constant pool

        if(s1.equals(s2)){
        System.out.println(s2);
        }
    //here equals method checks value in object is same or not
    }
}
