package Task1841;

import java.util.ArrayList;

/*
����������� ������� �.2
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        pilot((Human) astronauts.get(0));
        pilot((Human) astronauts.get(1));
        createDirection((Dog)astronauts.get(2));
        research((Cat) astronauts.get(3));
    }

    public static void pilot(Human human){
        System.out.println("���� ������� " + human.getInfo() + " ���������� �������.");
    }

    public static void createDirection(Dog dog){
        System.out.println("���� ������� " + dog.getInfo() + " ���������� ��������� �������������� ��������.");
    }

    public static void research(Cat cat){
        System.out.println("���� ������� " + cat.getInfo() + " ��������� ��������� �������.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("�� ���� ��������� ����� �������: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
