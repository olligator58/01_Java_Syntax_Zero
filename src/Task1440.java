import java.util.HashMap;

/*
������������ ���������
*/

public class Task1440 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("����", 5D);
        grades.put("����", 4.5);
        grades.put("����", 4D);
        grades.put("�������", 3.5);
        grades.put("�����", 3.0);
    }
}
