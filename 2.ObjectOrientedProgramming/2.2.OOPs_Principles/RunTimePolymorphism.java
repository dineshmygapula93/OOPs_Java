/*
   Run Time Polymorphism :-
            Binding of method class statements with method defination is done at the run time 
            is called as Run Time polymorphism
    Run Time Polymorhpism refers method overriding
   Method overriding:-
            If two or more methods have same name and same parameters list then it is said to be method overriding
            Method cannot be override in the same class because of ambiguity to call  
            Methods can be overridden in the inheritance only    
*/

class RP{
        void show(){
                System.out.println("i am method of before overriding");
        }
}
public class RunTimePolymorphism extends RP{
        void show(){
                System.out.println("i am method of after overriding");
        }
        public static void main(String[] args) {
                RunTimePolymorphism rtp=new RunTimePolymorphism();
                rtp.show();
        }
}

// In method overriding return type must be same except covariant return type
// Final methods cannot be overridden because final keyword used to prevent overridding
// Static methods cannot be overridden because static method doesnot require object to calls
// Private methods cannot be overridden because private method cannot be inherited (scope is limited to class only)
