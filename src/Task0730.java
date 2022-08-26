/*
Добро пожаловать! Но не всем.
*/

public class Task0730 {

    public static void main(String[] args) {
        signIn("user");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
