import java.util.Scanner;

/* 
������� ��������
*/

public class Task0372 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        
        if (Math.abs(a - b) < 0.000001) {
           System.out.println("����� �����");
        } else {   
           System.out.println("����� �� �����");
        }
        
        keyboard.close();
    }
}
