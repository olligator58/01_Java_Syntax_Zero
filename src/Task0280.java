import java.util.Scanner;

/* 
������ � �������������� �����
*/

public class Task0280 {

    public static void main(String[] args) {
        //�������� ��� ��� ���
       Scanner keyboard = new Scanner(System.in); 
       
       String line1 = keyboard.nextLine();
       String line2 = keyboard.nextLine();
       String line3 = keyboard.nextLine();
       
       System.out.println(line3);
       System.out.println(line2.toUpperCase());
       System.out.println(line1.toLowerCase());
       
	   keyboard.close();

    }
}
