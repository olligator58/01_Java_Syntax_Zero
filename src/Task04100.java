import java.util.Scanner;

/* 
Скорость ветра
*/

public class Task04100 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int speed = keyboard.nextInt();
        System.out.println((int)Math.round(speed * 3.6));
        keyboard.close();
    }
}