//Strings in switch statement:-
//                          This feature allows to pass string literials in a switch statement
public class StringInSwitchStatement {
    public static void main(String[] args) {
        switch (args[0])
         {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It is working");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It is Holiday");
                break;
        
            default:
                System.out.println("It is invalid");
                break;
        }
    }
}
