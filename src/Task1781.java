import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
��� ���� ������� ������
*/

public class Task1781 {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String text = dtf.format(zonedDateTime);
        System.out.println(text);
    }
}
