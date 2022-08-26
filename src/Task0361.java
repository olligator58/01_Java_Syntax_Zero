import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Task0361 {
    public static void main(String[] args) {
        
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        
        if (age < 20 || age > 60 ) {
           System.out.println("можно не работать");
        } 
        
        keyboard.close();
    }
}
