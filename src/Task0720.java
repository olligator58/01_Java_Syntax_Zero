/* 
������� �����
*/

public class Task0720 {

    public static void main(String[] args) {
        String firstName = "�����";
        String lastName = "�����������";
        String favouriteDish = "��������";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("������� �����:");
        System.out.println("���: " + name);
        System.out.println("�������: " + surname);
        System.out.println("������� �����: " + meal);
    }

}