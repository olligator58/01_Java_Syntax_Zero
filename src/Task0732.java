/*
���������� ����������� � ����
*/

public class Task0732 {
    public static void main(String[] args) {
        System.out.println(ninthDegree(2));
    }

    public static long cube(long a){

        return a*a*a;
    }

    public static long ninthDegree(long n) {
        return cube(cube(n));
    }
}
