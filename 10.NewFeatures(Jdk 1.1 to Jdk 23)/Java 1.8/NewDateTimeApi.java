/*New Date & Time api :- 
    1) LocalDate
    2)LocalTime
    3)LocalDateTime

       The above classes are used to get the system data & time
       The above classes are used to perform data & time related operations
       java.time.LocalDate;
       Methods:-
        public static LocalDate now();
        public LocalDate PlusYears(long);
        public LocalDate PlusMonths(long);
        public LocalDate PlusWeeks(long);
        public LocalDate PlusDays(long);
        public LocalDate MinusYears(long);
        public LocalDate MinusMonths(long);
        public LocalDate MinusWeeks(long);
        public LocalDate MinusDays(long);
 */
import java.time.*;
public class NewDateTimeApi {
    public static void main(String[] args) {
        //It returns the current system time
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
//It returns the day and date after 20 days
        LocalDate ld1=ld.plusDays(20);
        System.out.println(ld1);
    }   
}
