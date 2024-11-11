//Synchronization example
class Table{
    synchronized void printtable(int n){
        for(int i=0; i<=10 ;i++){
            int res=n*i;
            System.out.println(res);
        }
    }
}
class tab1 extends Thread{
    Table t;
    tab1(Table t){
        this.t=t;
    }
    public void run(){
        t.printtable(9);
    }
}
class tab2 extends Thread{
    Table t;
    tab2(Table t){
        this.t=t;
    }
    public void run(){
        t.printtable(7);
    }
}
public class SynchroExample {
    public static void main(String[] args) {
        Table t=new Table();
        tab1 t1=new tab1(t);
        t1.start();
        tab2 t2=new tab2(t);
        t2.start();
    }
}
