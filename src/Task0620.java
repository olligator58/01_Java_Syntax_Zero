/*
���������� �������
*/

public class Task0620 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //�������� ��� ��� ���
        int n = firstArray.length + secondArray.length;
        resultArray = new int[n];
        for (int i = 0; i < n; i++) {
            resultArray[i] = (i < firstArray.length) ? firstArray[i] : secondArray[i - firstArray.length];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
