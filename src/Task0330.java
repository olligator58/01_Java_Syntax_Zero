import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Task0330 {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        
        Scanner keyboard = new Scanner(System.in);
        int temperature = keyboard.nextInt();
        
        if (temperature < 0)
           System.out.println(cold); 
        else 
           System.out.println(warm); 
	   
	   keyboard.close();
        
    }
}
