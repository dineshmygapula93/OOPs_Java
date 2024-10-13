//Encapsulation:-
//      Binding of variables with methods into class is known as Encapsulation

public class Encapsulation {
    private int age;
    void setAge(int age){
        if(age<18){
            this.age=18;
        }else if(age>60){
            this.age=60;
        }else{
            this.age=age;
        }
    }
    int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Encapsulation es=new Encapsulation();
        es.setAge(24);
        int x=es.getAge();
        System.out.println(x);
    }
}
