import java.util.Scanner;

/* 
‘ломаннаЯ клавиатура
*/

public class Task0392 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        String password = keyboard.nextLine();
        
        if (password.equalsIgnoreCase(secret)) {
            System.out.println("доступ разрешен");
        } else {    
            System.out.println("доступ запрещен");
        }
        keyboard.close();
    }
}
