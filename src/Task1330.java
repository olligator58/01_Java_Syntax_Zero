import java.util.ArrayList;

/*
�����������
*/

public class Task1330 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("������");
        waitingEmployees.add("��������");
        waitingEmployees.add("���������");
        waitingEmployees.add("������");
        waitingEmployees.add("�������");
        waitingEmployees.add("�������");
        waitingEmployees.add("�����");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees.toString());
        paySalary("���������");
        paySalary("�����");
        System.out.println(waitingEmployees.toString());
        System.out.println(alreadyGotSalaryEmployees.toString());
    }

    public static void paySalary(String name) {
        if (name != null && waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}
