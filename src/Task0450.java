import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Task0450 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while(keyboard.hasNextInt()) {
            int a = keyboard.nextInt(); 
            if (a < min) {
                min = a;
            }     
        }
        System.out.println(min);
        keyboard.close();
    }
}