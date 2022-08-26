import java.util.Scanner;

/* 
Суммирование
*/

public class Task0432 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        while (keyboard.hasNextInt()) {
            sum += keyboard.nextInt();    
        }
        keyboard.nextLine();
		
		if (keyboard.nextLine().equals("ENTER")) {
            System.out.println(sum);
        }
        
        keyboard.close();
    }
}