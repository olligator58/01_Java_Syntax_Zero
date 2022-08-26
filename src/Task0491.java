import java.util.Scanner;

/* 
Share a Coke
*/

public class Task0491 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        System.out.println(a * 1.0 / b);
        keyboard.close();
    }
}