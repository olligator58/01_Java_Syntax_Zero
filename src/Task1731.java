import java.util.Calendar;
import java.util.GregorianCalendar;

/*
��������� ��������
*/

public class Task1731 {

    public static final String INVENTED = "����������, ������ ������� ��� ��������� ��������. ������� �� ��������!";
    public static final String NOT_INVENTED = "��������, �������� ��� �� ��������, ��������� ����� 10 ���.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        boolean invented = false;
        while (!invented) {
            if (!isTeleportInvented(currentDay)) {
                currentDay.add(Calendar.YEAR, 10);
            } else {
                invented = true;
            }
        }

    }

    static boolean isTeleportInvented(Calendar currentDay) {
        boolean result = false;
        if (currentDay.after(INVENTION_DAY)) {
            result = true;
            System.out.println(INVENTED);
        } else {
            System.out.println(NOT_INVENTED);
        }
        return result;
    }
}
