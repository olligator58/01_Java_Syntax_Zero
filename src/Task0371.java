import java.util.Scanner;

/* 
����� ������...
*/

public class Task0371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //  String result = number < 5 ? "����� ������ 5" : number > 5 ? "����� ������ 5" : "����� ����� 5";
        String result;
        
        if (number < 5) {
            result = "����� ������ 5"; 
        } else if (number > 5) {
            result = "����� ������ 5"; 
        } else result = "����� ����� 5";
        
        System.out.println(result);
        
        scanner.close();
    }
}
