/*command Line Arguments:-
            The arguments that are passed at the command prompt are called command line arguments
            Command line arguments are received by main method

            ex:- c:\>java Demo welcome to java
          Here welcome is at index 0 ,to at index 1, java at index 2
 */

public class CommandLineArgument {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }    
}