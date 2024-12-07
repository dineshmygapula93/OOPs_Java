import java.util.ArrayList;
import java.util.List;

public class StreamApiSortedMethod {
    
    public static void main(String[] args) {
          List<Integer> l=List.of(23,23,43,65,67,67,79,65,6453);
    ArrayList<Integer> al=new ArrayList<>(l);
    System.out.println(al);
    al.stream().sorted().forEach(a->System.out.println(a));
    }
}
