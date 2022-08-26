package Task1940;

public class Language {
    private String name;
    private Double ranking;

    public Language(String name, Double ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public Double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "язык программировани€ - " + name + ", рейтинг  - " + ranking + "% опрошенных.";
    }
}
