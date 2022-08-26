import java.util.ArrayList;
import java.util.Collections;

/*
������� ������ ������ Collections, ����� 3
*/

public class Task1432 {

    public static Integer min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 67, 23, -78, 1, 87, 23);
        Collections.sort(list);
        System.out.println(binarySearch(list , 87));
    }
}
