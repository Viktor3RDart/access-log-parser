import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
//    Перед вами код метода: реализации сортировки «пузырьком».
//
//    Перепишите код, чтобы вместо списка ArrayList<Integer> intList использовался массив int[] intArray.intArray

public class List_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(200+1)) - 100;
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> intList =  new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            intList.add((int) ((Math.random()*(200+1)) - 100));
        }
        System.out.println(intList);
    }



    public static void bubbleSort(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSort2(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] =  intArray[j + 1];
                    intArray[j + 1]  = temp;
                }
            }
        }
    }
}
