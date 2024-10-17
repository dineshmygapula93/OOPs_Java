//A group of statements between { and } is called as block
//A block is called as Initialization block because blocks are also used to initailize the variables
//A class can have any number of blocks & all blocks are executed top to bottom whenever is object is created
//Blocks are executed before constructor
public class Block {
    {
        System.out.println("i am block");
    }
    Block()
    {
        System.out.println("i am constructor");
    }
    public static void main(String[] args) {
        new Block();
    }
    {
        System.out.println("i am block 2");
    }
}
