//Program to convert String to byte array
public class StringToByteArray {
    public static void main(String[] args) {
        String s="abcde";
        byte [] b =s.getBytes();
        for (byte by : b) {
            System.out.println(by);
        }
    }
}
