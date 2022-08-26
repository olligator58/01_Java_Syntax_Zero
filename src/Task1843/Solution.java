package Task1843;

/*
������� vs ����������
*/

public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        String herbivore = "����� �����";
        String predator = "����� ����";

        if (animal instanceof Herbivore) {
            System.out.println(herbivore);
        } else if (animal instanceof Predator) {
            System.out.println(predator);
        }
    }
}
