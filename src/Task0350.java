import java.util.Scanner;

/* 
Измерим температуру тела
*/

public class Task0350 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        //напишите тут ваш код
        isHigh = (bodyTemperature > 37);
        isLow =(bodyTemperature < 36); 
        
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
        
        scanner.close();
    }
}
