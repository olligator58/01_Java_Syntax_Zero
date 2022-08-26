package Task1840;

import java.util.ArrayList;

/*
����������� ������� �.1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Cat());
        astronauts.add(new Dog());
    }

    public static void printCrewInfo() {
        System.out.println("�� ���� ��������� ����� �������: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
