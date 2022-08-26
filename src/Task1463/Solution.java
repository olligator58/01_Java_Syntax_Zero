package Task1463;

/*
—ледующий мес€ц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        Month[] months = Month.values();
        int index = (month.ordinal() != months.length - 1) ? month.ordinal() + 1 : 0;
        return months[index];
    }
}
