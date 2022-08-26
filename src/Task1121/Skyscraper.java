package Task1121;

/*
�������� ����� ����� �������� JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "��������� ��������.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "��������� ��������. ���������� ������ - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "��������� ��������. ���������� - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floorsCount) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floorsCount);
    }

    public Skyscraper(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}


