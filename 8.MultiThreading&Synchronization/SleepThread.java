//Program to demonistrate sleep method
public class SleepThread {
    public static void main(String[] args) {
        for(int i=0 ;i<=100 ;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.err.println(ie);
            }
        }
    }
}
