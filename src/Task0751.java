/*
������-�������
*/

public class Task0751 {
    public static String city = "�����";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("��������", 25.3);
        printCityPopulation("����", 25.2);
        printCityPopulation("����", 23.1);
        printCityPopulation("���-����", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("��������� ������ " + city + " ���������� " + population + " ��� �������.");
        System.out.println("� �� ����� ��� � ����� ��������������� ������ " + Task0751.city + " ��������� ���������� " + Task0751.population + " ��� �������.");
    }
}
