//Program to demonstrate Runnable interface
//Thread class implements the Runnable interface
//Runnable interface has only run method
class Test implements Runnable{
    public void run(){
        try {
            for(int i=0 ;i<=10 ;i++){
                System.out.println("Advanced java");
                Thread.sleep(3000);
            }
         //sleep method throws interrupted exception  
        } catch (InterruptedException ie) {
            System.err.println(ie);
        }
           
    }
}
public class MultiThreadingWithInterface implements Runnable {
    public void run(){
        try{
            for(int i=0 ;i<=10 ;i++){
                System.out.println("JavaEE");
                Thread.sleep(2000);
            }
            
        } catch (InterruptedException ie) {
            System.err.println(ie);
        }
        
    }
    public static void main(String[] args) {
        //Create the object of current class and assign to Runnable interface reference
        Runnable r=new MultiThreadingWithInterface();
        //Create a object of Thread class by passing runnable interface reference in a Thread class Constructor
        Thread th=new Thread(r);
        th.start();
        //Create the object of current class and assign to Runnable interface reference
        Runnable r1=new Test();
        Thread t=new Thread(r1);
        t.start();
        try{
        for(int i=0 ;i<=10 ;i++){
            System.out.println("JavaSE");
            Thread.sleep(1000);
        }
    } catch (InterruptedException ie) {
        System.err.println(ie);
    }

    }
}
