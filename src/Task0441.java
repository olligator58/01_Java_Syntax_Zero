/* 
����� �����, �� ������� 3
*/

public class Task0441 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        int i = 0;
        int sum = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            sum +=i;
        }
        System.out.println(sum);
    }
}