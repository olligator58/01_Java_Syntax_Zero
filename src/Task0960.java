/*
Степень двойки
*/

public class Task0960 {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        return (power == 0) ? 1: 2 << (power - 1);
    }
}
