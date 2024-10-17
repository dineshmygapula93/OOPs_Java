//A block with static keyword called as static block
//A static block is called as static Initialization block because static blocks are also used to initailize the static variables
//A class can have any number of static blocks & all static blocks are executed top to bottom whenever class is loaded
//static blocks are executed before main method
public class StaticBlock {
    static{
        System.out.println("i am static block");
    }
    public static void main(String[] args) {
        System.out.println("i am main method");
    }
    static{
        System.out.println("i am static block 2");
    }
    
}
//Static blocks are used in real time appliactions to load libraries
