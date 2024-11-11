//Program to demonstrte Synchronization with notify() & wait() methods
class Bank{
    float balance=5000.00f;
    synchronized void withdraw(float amount){
        try {
            System.out.println("Withdraw started...");
            if(balance<amount){
            System.out.println("Less Balance ,waiting for deposit");
            wait();
            }
            balance=balance-amount;
            System.out.println("Withraw completed...");
        } catch (InterruptedException ie) {
            System.err.println(ie);
        }
    }
    synchronized void deposit(float amount){
            System.out.println("Deposit started...");
            balance=balance+amount;
            System.out.println("Deposite completed...");
            notify();
    }
}
class Customer1 extends Thread{
    Bank b;
    Customer1(Bank b){
        this.b=b;
    }
    public void run(){
        b.withdraw(6000.00f);
    }
}
class Customer2 extends Thread{
    Bank b;
    Customer2(Bank b){
        this.b=b;
    }
    public void run(){
        b.deposit(3000);
    }
}
public class SynchronizationExample {
    public static void main(String[] args) {
        Bank b=new Bank();
        Customer1 c1=new Customer1(b);
        c1.start();
        Customer2 c2=new Customer2(b);
        c2.start();
    }
}