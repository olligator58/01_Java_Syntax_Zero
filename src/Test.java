/*
Степень двойки
*/

public class Test {

    private static int t = 20;

    public static void main(String[] args) {
        char c = '\u0030';
        System.out.println(c);
        String s = "Хуй";
        System.out.println(s.indexOf('у'));
        Test test = new Test();
        int a = test.getPowerOfTwo(2);
        int b = t;
        System.out.println(Integer.toBinaryString(1024));
    }

    public int getPowerOfTwo(int power) {
        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power;
        }
    }
}