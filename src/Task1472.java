/*
���� ���������������
 */
public class Task1472 {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        switch (countOfCorner) {
            case 3:
                shape = "�����������";
                break;
            case 4:
                shape = "���������������";
                break;
            case 5:
                shape = "������������";
                break;
            case 6:
                shape = "�������������";
                break;
            case 7:
                shape = "������������";
                break;
            case 8:
                shape = "��������������";
                break;
            default:
                shape = "������ ������";
        }
        return shape;
    }
}
