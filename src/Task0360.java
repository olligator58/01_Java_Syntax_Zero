import java.util.Scanner;

/* 
�����������
*/

public class Task0360 {
    private static final String TRIANGLE_EXISTS = "����������� ����������";
    private static final String TRIANGLE_NOT_EXISTS = "����������� �� ����������";

    public static void main(String[] args) {
        //�������� ��� ��� ���
       Scanner keyboard = new Scanner(System.in);    
       
       int a = keyboard.nextInt();
       int b = keyboard.nextInt();
       int c = keyboard.nextInt();
       
       if (a < (b + c) && b < (a + c) && c < (a + b))
          System.out.println(TRIANGLE_EXISTS);
       else 
		  System.out.println(TRIANGLE_NOT_EXISTS);
       
       keyboard.close(); 
    }
}
