import java.util.Calendar;
import java.util.GregorianCalendar;

/*
���� ������ �������� ������
*/

public class Task1730 {

    static Calendar birthDate = new GregorianCalendar(1980, 2, 27);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String result;
        switch (day) {
            case Calendar.SUNDAY:
                result = "�����������";
                break;
            case Calendar.MONDAY:
                result = "�����������";
                break;
            case Calendar.TUESDAY:
                result = "�������";
                break;
            case Calendar.WEDNESDAY:
                result = "�����";
                break;
            case Calendar.THURSDAY:
                result = "�������";
                break;
            case Calendar.FRIDAY:
                result = "�������";
                break;
            case Calendar.SATURDAY:
                result = "�������";
                break;
            default:
                result = "";
        }
        return result;
    }
}
