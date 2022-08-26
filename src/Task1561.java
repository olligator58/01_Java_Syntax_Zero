/*
������� ��������
*/

public class Task1561 {

    public static final String OUTPUT_FORMAT = "����� %s ������ �� ������ %d ������ %s � ����� %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement method: stackTrace) {
            System.out.printf(OUTPUT_FORMAT, method.getMethodName(), method.getLineNumber(), method.getClassName(), method.getFileName());
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
