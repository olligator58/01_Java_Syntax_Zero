/*
�� switch � if
 */
public class Task1471 {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("�������"));
        System.out.println(getTranslationForDayOfWeek("�������"));
        System.out.println(getTranslationForDayOfWeek("�����������"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.equalsIgnoreCase("�����������")) {
            en = "Monday";
        } else if (ru.equalsIgnoreCase("�������")) {
            en = "Tuesday";
        } else if (ru.equalsIgnoreCase("�����")) {
            en = "Wednesday";
        } else if (ru.equalsIgnoreCase("�������")) {
            en = "Thursday";
        } else if (ru.equalsIgnoreCase("�������")) {
            en = "Friday";
        } else if (ru.equalsIgnoreCase("�������")) {
            en = "Saturday";
        } else if (ru.equalsIgnoreCase("�����������")) {
            en = "Sunday";
        } else {
            en = "���������������� ���� ������";
        }
        return en;
    }
}
