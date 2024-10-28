//Chatting program between Client and server
import java.io.*;
import java.net.*;
public class ClientProgram {
    public static void main(String[] args) {
        try {
            String soc="Localhost";
            int port=1024;
            Socket socket=new Socket(soc,port);
            //OutputStream object is used to send over network
            OutputStream os=socket.getOutputStream();
            //InputStream object is used to recive over network
            InputStream is=socket.getInputStream();
            byte [] b1=new byte[100];
            byte [] b2=new byte[100];
            while(true){
                System.out.print("To server :");
                //Reads the data from keyboard
                System.in.read(b1);
                //Write the data into object
                os.write(b1);
                //Reads the data from server
                is.read(b2);
                String s1=new String(b2);
                String s2=s1.trim();
                System.out.println("From Server :"+s2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
