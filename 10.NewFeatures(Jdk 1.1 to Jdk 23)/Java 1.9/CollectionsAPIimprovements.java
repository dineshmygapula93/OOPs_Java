/*Collections API improvoments:-
 *  This feature allows to add any number of elements to a list & set with single method call statment
 *  It also allows to add any number of key value pairs to a map with single method call statement
 */

import java.util.*;

public class CollectionsAPIimprovements {
    public static void main(String[] args) {
        List<Integer> l=List.of(23,34,23,54,23,5,6453);
        ArrayList<Integer> al=new ArrayList<>(l);
        System.out.println(al);
    }
}
