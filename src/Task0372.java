import java.util.Scanner;

/* 
Высокая точность
*/

public class Task0372 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        
        if (Math.abs(a - b) < 0.000001) {
           System.out.println("числа равны");
        } else {   
           System.out.println("числа не равны");
        }
        
        keyboard.close();
    }
}
