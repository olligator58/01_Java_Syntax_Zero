import java.util.Arrays;

/*
���� �� ���?
*/

public class Task0683 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copyarray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyarray);
        boolean found = (Arrays.binarySearch(copyarray,element) >= 0) ? true : false;
        System.out.println(found);
    }
}
