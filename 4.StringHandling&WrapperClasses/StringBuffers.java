/*StringBuffer
 * Java StringBuffer class is used to create mutable (modifiable) String objects. 
 * The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
 * Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. 
 * So it is safe and will result in an order.(Synchronised)
 */
public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        sb.append("dinesh");
        System.out.println(sb);
    }
}
