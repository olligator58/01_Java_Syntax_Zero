import java.util.HashMap;

/*
Успеваемость студентов
*/

public class Task1440 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Коля", 5D);
        grades.put("Вася", 4.5);
        grades.put("Петя", 4D);
        grades.put("Андрюша", 3.5);
        grades.put("Слава", 3.0);
    }
}
