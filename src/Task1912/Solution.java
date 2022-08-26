package Task1912;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("���� ������"),
                new JavaRushMentor("����"),
                new JavaRushMentor("��������� �����"),
                new JavaRushMentor("���� �����"),
                new JavaRushMentor("���"),
                new JavaRushMentor("����� ������"),
                new JavaRushMentor("�����"),
                new JavaRushMentor("���� �������")
        );

        Collections.sort(mentors, new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}
