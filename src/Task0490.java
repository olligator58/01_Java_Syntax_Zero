import java.util.Scanner;

/* 
Площадь круга
*/

public class Task0490 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int radius = keyboard.nextInt();
        if (radius >= 0) {
            System.out.println((int)(3.14 * radius * radius));
        }
        keyboard.close();
    }
}