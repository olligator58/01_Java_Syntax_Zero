import java.util.Scanner;

/* 
�������� ��� �� �������� - ��� � ��� ������
*/

public class Task0361 {
    public static void main(String[] args) {
        
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        
        if (age < 20 || age > 60 ) {
           System.out.println("����� �� ��������");
        } 
        
        keyboard.close();
    }
}
