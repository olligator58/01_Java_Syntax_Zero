import java.util.Date;

/*
���� �� �� � ����������� :)
*/

public class Task1720 {

    static Date birthDate = new Date(122, 0, 23);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int day = date.getDay();
        String result;
        switch (day) {
            case 0:
                return "�����������";
            case 1:
                result = "�����������";
                break;
            case 2:
                result = "�������";
                break;
            case 3:
                result = "�����";
                break;
            case 4:
                result = "�������";
                break;
            case 5:
                result = "�������";
                break;
            case 6:
                result = "�������";
                break;
            default:
                result = null;
        }
        return result;
    }
}
