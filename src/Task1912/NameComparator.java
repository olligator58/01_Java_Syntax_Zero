package Task1912;

import java.util.Comparator;

/*
���������� JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2) {
        return mentor1.getName().length() - mentor2.getName().length();
    }
}
