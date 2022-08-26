import java.util.Scanner;

/*
”дал€ем одинаковые строки
*/

public class Task0640 {
    public static String[] strings;
    public static final int LINES_NUMBER = 6;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        strings = new String[LINES_NUMBER];
        //ввод массива
        for (int i = 0; i < strings.length; i++) {
            strings[i] = keyboard.nextLine();
        }
        //убираем повтор€ющиес€ строки
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                //String line = strings[i];
                boolean found = false;
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null && strings[j].equals(strings[i])) { // в остатке массива ищем повтор€ющиес€ строки и обнул€ем их
                        strings[j] = null;
                        found = true; // нашли повтор€ющуюс€ строку
                    }
                }
                if (found) {
                    strings[i] = null; // если в остатке массива нашли повтор€ющуюс€ строку, то обнул€ем текущий элемент массива
                }
            }
        }
        //вывод массива
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        keyboard.close();
    }
}
