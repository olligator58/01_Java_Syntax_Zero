import java.util.Scanner;

/* 
�������� �� ������ �����
*/

public class Task0480 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        int number = keyboard.nextInt();
        if (number >= 5) {
            number = 0;
        }
        int i = 0;
        do {
            System.out.println(line);
            i++;
        }
        while (i < number); 
        keyboard.close();
    }
}