/* 
������������� ��������
*/

public class Task0721 {
    public static void main(String[] args) {
        String navigator = "����";
        String pilot = "���";
        String secondPilot = "������";
        String flightEngineer = "�����";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("�������, ������� ��������� �������� ������:");
        System.out.println("�������: " + navigator);
        System.out.println("�����: " + pilot);
        System.out.println("������ �����: " + secondPilot);
        System.out.println("�����������: " + flightEngineer);
    }
}