import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/*
Тренировка временных зон
*/

public class Task1770 {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> tree = new TreeSet<>();
        tree.addAll(ZoneId.getAvailableZoneIds());
        return tree;
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zoneid = ZoneId.of( "Asia/Shanghai");
        return ZonedDateTime.now(zoneid);
    }
}
