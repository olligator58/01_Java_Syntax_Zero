import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/*
Еще раз читаем из консоли
*/

public class Task1632 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        char[] chars = line.toCharArray();
        Set<Character> characters = new HashSet<>();
        for (char aChar : chars) {
            if (Character.isAlphabetic(aChar)) {
                characters.add(Character.toLowerCase(aChar));
            }
        }
        System.out.println(characters);
        keyboard.close();
    }
}

