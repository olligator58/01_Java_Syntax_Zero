import java.util.Scanner;

/* 
����� ��� �������
*/

public class Task0330 {
    public static void main(String[] args) {
        String cold = "�� ����� �������";
        String warm = "�� ����� �����";
        //�������� ��� ��� ���
        
        Scanner keyboard = new Scanner(System.in);
        int temperature = keyboard.nextInt();
        
        if (temperature < 0)
           System.out.println(cold); 
        else 
           System.out.println(warm); 
	   
	   keyboard.close();
        
    }
}
