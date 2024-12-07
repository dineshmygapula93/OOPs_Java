import java.util.ArrayList;
import java.util.List;
public class StreamApiMapMethod{
    public static void main(String[] args) {
        List<Integer> l=List.of(34,34,23,56,34,78,85,878);
        ArrayList<Integer> al=new ArrayList<>(l);
        System.out.println(al);
        al.stream().map(a->a+5).forEach(a->System.out.println(a));
    }
}

