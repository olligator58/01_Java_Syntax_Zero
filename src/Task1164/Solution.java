package Task1164;

/*
������� ������
*/

public class Solution {

    public static void showWeather(City city) {
        String text = "� ������ %s ������� ����������� ������� %d";
        System.out.println(String.format(text,city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
        showWeather(new City("�����", 40));
    }
}
