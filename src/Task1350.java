import java.util.ArrayList;

/*
��������� �������
*/

public class Task1350 {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("������ ������");
        print();
    }

    public static void createNewPlanet(String planetName) {
        planets.add(planets.indexOf("�����") + 1, planetName);
    }

    public static void addPlanets() {
        planets.add("��������");
        planets.add("������");
        planets.add("�����");
        planets.add("����");
        planets.add("������");
        planets.add("������");
        planets.add("����");
        planets.add("������");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s � %d-� ������� �� ������", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
