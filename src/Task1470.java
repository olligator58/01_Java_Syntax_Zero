/*
�� if � switch
 */
public class Task1470 {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        switch (monthIndex) {
            case 1:
                monthString = "������";
                break;
            case 2:
                monthString = "�������";
                break;
            case 3:
                monthString = "����";
                break;
            case 4:
                monthString = "������";
                break;
            case 5:
                monthString = "���";
                break;
            case 6:
                monthString = "����";
                break;
            case 7:
                monthString = "����";
                break;
            case 8:
                monthString = "������";
                break;
            case 9:
                monthString = "��������";
                break;
            case 10:
                monthString = "�������";
                break;
            case 11:
                monthString = "������";
                break;
            case 12:
                monthString = "�������";
                break;
            default:
                monthString = "���������������� �����";
        }
        return monthString;
    }
}
