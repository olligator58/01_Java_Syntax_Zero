import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Task0431 {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        int i = 0;
        
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
        keyboard.close();
    }
}
