import java.util.HashMap;

/*
������������ ���������-2
*/

public class Task1441 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("������ ��������� ������: ");
        printStudents();
        System.out.print("������� ���� ������: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("������� ����", 4.3d);
        grades.put("������ �������", 4.1d);
        grades.put("����� �������", 4.9d);
        grades.put("�������� �����", 3.7d);
        grades.put("������ ��������", 3.2d);
    }

    public static void printStudents() {
        for (String fio : grades.keySet()) {
            System.out.println(fio);
        }
    }

    public static Double getAverageMark() {
        double averageMark = 0;
        for (String key : grades.keySet()) {
            averageMark = averageMark + grades.get(key);
        }
        return averageMark / grades.size();
    }
}
