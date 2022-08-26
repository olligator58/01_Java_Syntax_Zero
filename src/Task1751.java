import java.time.LocalTime;

/*
Нужно просто посчитать
*/

public class Task1751 {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        LocalTime time = base.plusHours(4);
        return time.plusMinutes(48);
    }
}
