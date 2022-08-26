import java.util.Scanner;

/* 
—ерез тернии...
*/

public class Task0371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //  String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
        String result;
        
        if (number < 5) {
            result = "число меньше 5"; 
        } else if (number > 5) {
            result = "число больше 5"; 
        } else result = "число равно 5";
        
        System.out.println(result);
        
        scanner.close();
    }
}
