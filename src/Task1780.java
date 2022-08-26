import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Простой шаблон
*/

public class Task1780 {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        System.out.println(dtf.format(localDateTime));
    }
}
