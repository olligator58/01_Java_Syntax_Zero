import java.util.Calendar;
import java.util.GregorianCalendar;

/*
����� �� �������������
*/

public class Task1732 {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("�����");
        while (start.before(end)) {
            start.add(Calendar.DATE, 1);
            System.out.print(".");
        }
        System.out.print("�����");
    }
}
