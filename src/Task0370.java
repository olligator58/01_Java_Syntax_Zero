import java.util.Scanner;

/* 
€щем максимум
*/

public class Task0370 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        
        int max = numberA > numberB ? numberA : numberB; 
        System.out.println(max);
        
        scanner.close();
    }
}
