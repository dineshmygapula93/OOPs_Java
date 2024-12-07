import java.util.ArrayList;
import java.util.List;

public class StreamApiReduceMethod {
    
    public static void main(String[] args) {
          List<Integer> l=List.of(23,23,43,65,67,67,79,65,6453);
    ArrayList<Integer> al=new ArrayList<>(l);
    System.out.println(al);
    System.out.println(al.stream().reduce(0,(a,b)->a+b));
    }
}
