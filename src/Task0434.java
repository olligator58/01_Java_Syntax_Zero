/* 
������������� �������������
*/

public class Task0434 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        int h = 0;
        while (h < 10) {
            int w = 0;
            while (w < 20) {
                if (h == 0 || h == 9 || w == 0 || w == 19) {
                    System.out.print("�");
                } else {
                    System.out.print(" ");    
                }
                w++;
            }
            System.out.println();
            h++;
        }
    }
}