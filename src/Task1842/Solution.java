package Task1842;

import java.util.ArrayList;

/*
����������� ������� �.3
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        for (Astronaut astronaut: astronauts) {
            if (astronaut instanceof Human) {
                pilot((Human) astronaut);
            } else if (astronaut instanceof Dog) {
                createDirection((Dog) astronaut);
            } else if (astronaut instanceof Cat) {
                research((Cat) astronaut);
            }
        }
    }

    public static void pilot(Human human) {
        System.out.println("���� ������� " + human.getInfo() + " ���������� �������.");
    }

    public static void createDirection(Dog dog) {
        System.out.println("���� ������� " + dog.getInfo() + " ���������� ��������� �������������� ��������.");
    }

    public static void research(Cat cat) {
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
