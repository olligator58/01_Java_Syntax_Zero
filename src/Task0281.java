import java.util.Scanner;

/* 
Чтение чисел
*/

public class Task0281 {

    public static void main(String[] args) {
        //напишите тут ваш код
       Scanner keyboard = new Scanner(System.in);   
       
       int a = keyboard.nextInt();
       int b = keyboard.nextInt();
       int c = keyboard.nextInt();
       
       System.out.println((a + b + c) / 3);
	   
	   keyboard.close();

    }
}
