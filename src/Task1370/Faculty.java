package Task1370;

import java.util.ArrayList;

/*
��������� � ��������
*/

public class Faculty {

    public static void main(String[] args) {
        ArrayList students = new ArrayList<Student>();
        students.add(new Student("������"));
        students.add(new Student("��������"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
