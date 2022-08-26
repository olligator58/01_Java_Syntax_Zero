/*
String.format()
*/

public class Task1061 {
    public static void main(String[] args) {
        System.out.println(format("јмиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = String.format("ћен€ зовут %s. я буду зарабатывать $%d в мес€ц.", name, salary);
        return phrase;
    }
}
