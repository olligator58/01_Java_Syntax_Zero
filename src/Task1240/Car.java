package Task1240;

/*
��������� � ������ ����������
*/

public class Car {
    private Engine engine;

    public class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}
