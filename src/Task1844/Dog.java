package Task1844;

public class Dog extends Pet {
    public static final String DOG = "� ����� �����.";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(DOG);
    }
}
