package Task1242;

/*
������� ���������� � ��������� �������
*/

public class Outer {

    class Inner {
        Inner() {
            System.out.println("�������� ������� ����������� ������");
        }
    }

    static class Nested {
        Nested() {
            System.out.println("�������� ������� ���������� ������");
        }
    }
}
