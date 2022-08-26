import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Task0451 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (keyboard.hasNextInt()) {
            int a = keyboard.nextInt();
            if (a % 2 == 0 && a > max) {
                max = a;
            }
        }
        System.out.println(max);
        keyboard.close();
    }
}