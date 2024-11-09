//MultiThreading using java.lang.Thread class
public class MultiThreadingWithclass extends Thread {
    //we should overide the run method because it is abstract method of Runnable interface
        public void run(){
            for(int i=0 ;i<=10 ;i++){
                System.out.println("new thread "+i);
            }
        }
    public static void main(String[] args) {
        MultiThreadingWithclass mt=new MultiThreadingWithclass();
        //Here start() method implicityly calls the run method
        mt.start();
        for(int i=0 ;i<=10 ;i++){
            System.out.println("Main thread "+i);
        }
        }    
}