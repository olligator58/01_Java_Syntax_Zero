import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Task0280 {

    public static void main(String[] args) {
        //напишите тут ваш код
       Scanner keyboard = new Scanner(System.in); 
       
       String line1 = keyboard.nextLine();
       String line2 = keyboard.nextLine();
       String line3 = keyboard.nextLine();
       
       System.out.println(line3);
       System.out.println(line2.toUpperCase());
       System.out.println(line1.toLowerCase());
       
	   keyboard.close();

    }
}
