package Task1264;

import java.util.ArrayList;
import java.util.List;

/*
���������� ���� �������
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("������ ����������");
        students.add("������� ���������");
        students.add("������ ���������");
        students.add("������� ����������");
        students.add("��� ���������");
        students.add("������� �������");
        students.add("������� ����������");
    }

    public void exclude(String excludedStudent) {
        ArrayList<String> copy = new ArrayList<String>(students);
        for (String student : copy) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("������� ���������");
        universityGroup.students.forEach(System.out::println);
    }
}