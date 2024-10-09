class SCP{
    SCP(int x){
        System.out.println(x);
    }
}
public class SuperConstructorParameterized extends SCP {
    SuperConstructorParameterized(int y){
        //Here super(arg) must be there because SCP constructor is parameterized
        //if we write super(args) then super() will not be comes implicitly in first line
        //if we don't write super(argument) then it is invalid
        super(20);
        System.out.println(y);
    }
    public static void main(String[] args) {
        new SuperConstructorParameterized(10);
    }
}
