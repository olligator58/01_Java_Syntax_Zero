import java.util.Scanner;

/* 
Призывная кампания
*/

public class Task0331 {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        
        Scanner keyboard = new Scanner(System.in);
        
        String name = keyboard.nextLine();
        int age = keyboard.nextInt();
        
        if (age >= 18 && age <= 28)
           System.out.print(name + militaryCommissar);
        
        keyboard.close();
    }
}
