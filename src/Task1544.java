/*
����������� ����������
*/

public class Task1544 {

    public static void main(String[] args) {
        try {
            System.out.println("��������� �������� �� ������");
            Thread.sleep(1000);
            System.out.println("�� �����");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("��������� ���������� �� ����� N");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("��������� ���������� �� ����� I");
        } catch (ClassCastException e) {
            System.out.println("��������� ���������� �� ����� C");
        }
    }
}
