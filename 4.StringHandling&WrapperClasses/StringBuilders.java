/*StringBuilder:-
 * Java StringBuilder class is used to create mutable (modifiable) String. 
 * The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.
 *  It is available since JDK 1.5.
 */
public class StringBuilders {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("hello");
    //append method is used to add String to sb which is mutable
    sb.append("dinesh");
    System.out.println(sb);
  }
}
