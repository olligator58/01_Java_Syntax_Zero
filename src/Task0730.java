/*
����� ����������! �� �� ����.
*/

public class Task0730 {

    public static void main(String[] args) {
        signIn("user");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("����� ���������� " + username);
        System.out.println("����� ������� �� ���, " + username);
    }
}
