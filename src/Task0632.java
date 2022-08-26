import java.util.Scanner;

/*
ћаксимальное из N чисел
*/

public class Task0632 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int n = Integer.parseInt(keyboard.nextLine());
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(keyboard.nextLine());
        }
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        keyboard.close();
    }
}
