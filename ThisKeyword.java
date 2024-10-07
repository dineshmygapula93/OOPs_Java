//THis keyword is called as Object reference or reference variable because it refers object
//It always refers current object
//It is implicitly present in Instance method,intialization block &constructor
public class ThisKeyword {
    int x=10;
    void display(){
        //in below line this is implicity there
        System.out.println(x);
    }
    void show(){
        int x=20;
        //the x holds the values of 20 in show method
        System.out.println(x);
        //This keyword is explicitly required to access instance variable whenever instance variable & local variables names oare same
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        ThisKeyword tk =new ThisKeyword();
        tk.display();
        tk.show();
    }
}
