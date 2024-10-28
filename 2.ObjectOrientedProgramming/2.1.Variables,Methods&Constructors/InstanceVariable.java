//The variable which is created outiside main method is called InstanceVariable
//It is defined as the Member of the class
//The memory allocated to the instance variable Whenever object is Created
public class InstanceVariable {
    int num=24;
    public static void main(String[] args) {
        InstanceVariable iv=new InstanceVariable();
        System.out.println(iv.num);
    }
}
