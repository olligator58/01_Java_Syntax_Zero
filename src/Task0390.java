import java.util.Scanner;

/* 
‘равним строки
*/

public class Task0390 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        String str1 = keyboard.nextLine();
        String str2 = keyboard.nextLine();

        if (str1.equals(str2)) {
            System.out.println("строки одинаковые");
        } else {    
            System.out.println("строки разные");
        }
        keyboard.close();
    }
}
