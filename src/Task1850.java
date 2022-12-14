/*
??????????? ? ????????????
*/

public class Task1850 {
    public static void main(String[] args) {
        System.out.println(min(3, 7));
        System.out.println(min(8, -90, 2));
        System.out.println(min(3, 1, 8, 0));
        System.out.println(min(4,90, -7, 80, 5000));
        System.out.println(max(3, 7));
        System.out.println(max(8, -90, 2));
        System.out.println(max(3, 1, 8, 0));
        System.out.println(max(4,90, -7, 80, 5000));
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static int max(int a, int b, int c, int d, int e) {
        return Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
    }
}
