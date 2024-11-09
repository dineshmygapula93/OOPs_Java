//Program to demonstrate the  multithreading with sleep method
public class MultiThreadingExample extends Thread {
    public void run(){
       try {
            for(int i=0 ;i<=10 ;i++){
                String s=getName();
                System.out.println(s+" : "+i);
                if(s.equals("test")){
                    Thread.sleep(1000);
                }else{
                    Thread.sleep(2000);
                }
            }
       } catch (InterruptedException ie) {
        System.err.println(ie);
       }
    }
    public static void main(String[] args) {
        try {
            MultiThreadingExample m1=new MultiThreadingExample();
            m1.setName("test");
            m1.start();
            MultiThreadingExample m2=new MultiThreadingExample();
            m2.setName("sample");
            m2.start();
            Thread t=Thread.currentThread();
            for(int i=0 ;i<=10 ;i++){
                System.out.println(t.getName()+" : "+i);
                Thread.sleep(2000);
        }
    } catch (InterruptedException ie) {
        System.err.println(ie);
    }
    }
}
