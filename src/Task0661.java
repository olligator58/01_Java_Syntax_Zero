import java.util.Scanner;

/*
������� ��������� ������
*/

public class Task0661 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = Integer.parseInt(keyboard.nextLine());
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length; i++) {
            int j = Integer.parseInt(keyboard.nextLine());
            multiArray[i] = new int[j];
        }
    /*  ����� ������� �� ������� �� ���������
        for (int i = 0; i < multiArray.length ; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        } */
        keyboard.close();
    }
}
