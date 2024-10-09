//Instance Variables Initialization with Constructors
public class Emp{
    int empNo;
    int salary;
    Emp(int empNo,int salary){
        this.empNo=empNo;
        this.salary=salary;
    }
    public static void main(String[] args) {
        Emp e1=new Emp(101,50000);
        Emp e2=new Emp(102,60000);
        Emp e3=new Emp(103,70000);
        System.out.println("employeeid :"+e1.empNo+"\tsalary :"+e1.salary);
        System.out.println("employeeid :"+e2.empNo+"\tsalary :"+e2.salary);
        System.out.println("employeeid :"+e3.empNo+"\tsalary :"+e3.salary);
//This way of initialization is suitable for one object and many objects also      
    }
}
