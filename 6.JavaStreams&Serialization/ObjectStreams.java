//Program to demonstrate object Streams & serialization
import java.io.*;
class emp implements Serializable{
    int empNo=101;
    float salary=5000.00f;
}
public class ObjectStreams {
    public static void main(String[] args){
        try {
            emp e1=new emp();
            FileOutputStream fos=new FileOutputStream("emp.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(e1);

            oos.close();
            fos.close();

            FileInputStream fis=new FileInputStream("emp.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            emp e2=(emp)ois.readObject();
            System.out.println(e2.empNo+"\t"+e2.salary);
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
