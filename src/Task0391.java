public class Task0391 {
    public static String string1 = "�����";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "������ �� ������ ����������";
        String different = "������ �� ������ ������";
        //�������� ��� ��� ���
        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }  
        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }  
        
    }
}
