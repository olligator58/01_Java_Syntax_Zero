import java.util.ArrayList;
import java.util.Collections;

/*
Изучаем методы класса Collections, часть 2
*/

public class Task1431 {

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, -78, 9, 100, 2);
        shuffle(list);
        System.out.println(list);
    }
}
