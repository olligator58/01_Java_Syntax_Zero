package Task1163;

/*
≈жик и €блоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
