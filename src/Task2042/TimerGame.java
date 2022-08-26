/*
package Task2042;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

*/
/*
������
*//*


public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        setCellNumber(1, 1, step);
        Color color = (step % 2 == 0) ? Color.GREEN : Color.ORANGE;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, color);
            }
        }
    }
}
*/
