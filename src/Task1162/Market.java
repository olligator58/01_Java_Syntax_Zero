package Task1162;

/*
���� 10 �������
*/

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("����� 10 �������");
        } else {
            System.out.println("����� 1 �����");
        }
    }
}
