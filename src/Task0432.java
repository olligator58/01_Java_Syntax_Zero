import java.util.Scanner;

/* 
������������
*/

public class Task0432 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        while (keyboard.hasNextInt()) {
            sum += keyboard.nextInt();    
        }
        keyboard.nextLine();
		
		if (keyboard.nextLine().equals("ENTER")) {
            System.out.println(sum);
        }
        
        keyboard.close();
    }
}