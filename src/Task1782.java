import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
?????? ??????
*/

public class Task1782 {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime;
        dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);
        System.out.println(dateTime);
    }
}
