package Task1461;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javarushQuests = JavarushQuest.values();
        for (int i = 0; i < javarushQuests.length; i++) {
            System.out.println(javarushQuests[i].ordinal());
        }
    }
}
