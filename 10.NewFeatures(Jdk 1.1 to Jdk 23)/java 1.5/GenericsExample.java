public class GenericsExample<T ,U ,V>{
    T empNo;
    U name;
    V salary;
    public GenericsExample(T empNo, U name, V salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }
    public static void main(String[] args) {
        GenericsExample<Integer ,String ,Float> g1=new GenericsExample<Integer,String,Float>(101,"Dinesh",5000.55f);
        System.out.println(g1.empNo+" : "+g1.name+" : "+g1.salary);
        GenericsExample<Integer ,String ,Float> g2=new GenericsExample<Integer,String,Float>(102,"naga sai",5001.55f);
        System.out.println(g2.empNo+" : "+g2.name+" : "+g2.salary);
    }
}
