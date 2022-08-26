import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Task04101 {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        boolean isOptimist = keyboard.nextBoolean();
        int a = (isOptimist) ? (int)Math.ceil(glass) : (int)Math.floor(glass);
        System.out.println(a);
        keyboard.close();
    }
}