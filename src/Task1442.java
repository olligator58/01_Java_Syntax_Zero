import java.util.HashMap;
import java.util.Map;

/*
������������ ���������-3
*/

public class Task1442 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("�������� ����", 4.3d);
        grades.put("������ �������", 4.1d);
        grades.put("����� �������", 4.9d);
        grades.put("�������� �����", 3.7d);
        grades.put("������ ��������", 3.2d);
    }

    public static void printStudentsInfo() {
        for (Map.Entry<String, Double> pair: grades.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
