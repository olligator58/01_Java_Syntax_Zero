import java.util.Scanner;

/* 
ѕоказываем, что получаем
*/

public class Task0440 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        while(true) {
            String text = keyboard.nextLine(); 
            if (text.equals("enough")) {
                break;
            }
            System.out.println(text);
        }
        keyboard.close();
    }
}