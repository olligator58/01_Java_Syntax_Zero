package Task1160;

import java.util.Arrays;

/*
�������������� ������
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                //���� ��������� ��������� ������, �, ���� �����, ������ �� �������
                int j = i + 1;
                boolean found = false;
                while (j < array.length ) {
                    if (array[j] != null) {
                        found = true;
                        break;
                    }
                    j++;
                }
                if (found) {
                    array[i] = array[j];
                    array[j] = null;
                }  else {
                    break;
                }
            }
        }
    }
}
