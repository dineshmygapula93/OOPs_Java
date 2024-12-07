import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class StreamApiFilterMethod {
    public static void main(String[] args) {
    //Here of() method used to pass any number of elements
    List<Integer> l=List.of(23,23,43,65,67,67,79,65,6453);
    ArrayList<Integer> al=new ArrayList<>(l);
    System.out.println(al);
        Stream<Integer> s1=al.stream();
        Predicate<Integer> pd=a->a>35;
        Stream<Integer> s2=s1.filter(pd);
        Consumer<Integer> c=a->System.out.println(a);
        s2.forEach(c);
//We can write above 4 line like below
//al.stream().filter(a->a>35).forEach(a->System.out.println(a));
    }
}
