//Chatting program between Client and server
import java.io.*;
import java.net.*;
public class ServerProgram {
    public static void main(String[] args) {
        try {
            int port=1024;
            ServerSocket serversocket=new ServerSocket(port);
            //InputStream object is used to recive over network
            Socket s=serversocket.accept();
            InputStream is=s.getInputStream();
            //OutputStream object is used to send over network
            OutputStream os=s.getOutputStream();
            byte [] b1=new byte[100];
            byte [] b2=new byte[100];
            while(true){
               
                //Reads the data from Client
                is.read(b1);
                String s1=new String(b1);
                String s2=s1.trim();
                System.out.println("From Client :"+s2);
                System.out.print("To Client :");
                 //Reads the data from keyboard
                 System.in.read(b2);
                //Write the data into object
                os.write(b2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

