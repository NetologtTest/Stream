import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        int[] arr = new int[intList.size()];
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < 0) {
                i++;
                continue;
            }
            arr[i] = intList.get(i);

        }
        System.out.println();
        for (int i = 0; i < arr.length; ) {
            if (arr[i] % 2 != 0 || arr[i] == 0) {
                i++;
                continue;
            }
            arr2[i] = arr[i];
            i++;
        }
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}


