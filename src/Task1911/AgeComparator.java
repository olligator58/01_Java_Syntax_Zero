package Task1911;

import java.util.Comparator;

/*
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return student2.getAge() - student1.getAge();
    }
}
