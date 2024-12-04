/*Generic Type Inference:-
 *      This feature allows to create an object to a generic class in new way
 *      Emp<Integer, String, Float> e =new Emp<Integer, String, Float>();
 *      The above code can be written from jdk 1.7 onwards as follow
 *      Emp<Integer, String, Float> e =new Emp<>();
 */
public class GenericTypeInference<T ,U ,V>{
        T empNo;
        U name;
        V salary;
        public GenericTypeInference(T empNo, U name, V salary) {
            this.empNo = empNo;
            this.name = name;
            this.salary = salary;
        }
        public static void main(String[] args) {
            GenericTypeInference<Integer ,String ,Float> g1=new GenericTypeInference<>(101,"Dinesh",5000.55f);
            System.out.println(g1.empNo+" : "+g1.name+" : "+g1.salary);
            GenericTypeInference<Integer ,String ,Float> g2=new GenericTypeInference<>(102,"naga sai",5001.55f);
            System.out.println(g2.empNo+" : "+g2.name+" : "+g2.salary);
        }
}
