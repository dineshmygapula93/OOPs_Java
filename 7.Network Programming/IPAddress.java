//It is used to find the ip address of your network
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
    public static void main(String[] args) {
        try {
           InetAddress add=InetAddress.getByName("Localhost");
           System.out.println(add);
        } catch (UnknownHostException ue) {
           System.err.println(ue);
        }
    }
}