package Task1531;

/*
��� ����, � ��� �� ����������
*/

public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("���� ���");
            System.out.println("����� " + food.name);
            System.out.println("��� ����");
        } catch (NullPointerException e) {
            System.out.println("������ �� �����");
            return;
        } finally {
            System.out.println("��� �����" + (food == null ? " ��������" : ""));
        }

    }
}
