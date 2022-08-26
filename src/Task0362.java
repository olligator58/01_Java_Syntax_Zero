import java.util.Scanner;

/* 
 оординатные четверти
*/

public class Task0362 {
    public static void main(String[] args) {
        //напишите тут ваш код
       Scanner keyboard = new Scanner(System.in);    
       
       int x = keyboard.nextInt();
       int y = keyboard.nextInt();
       
       if (x > 0 && y > 0) {
          System.out.println("1");
       } else if (x < 0 && y > 0) {
          System.out.println("2");
       }
         else if (x < 0 && y < 0) {
          System.out.println("3");
       }
         else if (x > 0 && y < 0) {
          System.out.println("4");
       }
       
       keyboard.close();
    }
}
