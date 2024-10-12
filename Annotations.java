/*
        Annotations are meta tags that are used to pass additional some information to compiler about methods 
        classes & interfaces
        All annotations begins with @ Symbol

*/
class An{
        void show (){
                System.out.println("class 1");
        }
}
public class Annotations extends An{
        //Here @override is the annotations checks wheather show method is overridden or not
        @Override
        void show(){
                System.out.println("class 2");
        }
        public static void main(String[] args) {
                Annotations obj=new Annotations();
                obj.show();
        }
}
