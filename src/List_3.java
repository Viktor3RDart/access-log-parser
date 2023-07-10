import java.util.ArrayList;

//Перед вами код метода, который переставляет числа в массиве в обратном порядке.
//
//public static void reverse(int[] intArray) {
//        int n = intArray.length - 1;
//        for (int i = 0; i < intArray.length / 2; i++) {
//        int temp = intArray[i];
//        intArray[i] = intArray[n - i];
//        intArray[n - i] = temp;
//        }
//        }
//        Задача: написать такой же метод для ArrayList<Integer>.
public class List_3 {
    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }
    public static void reverse2(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.get(i) = intList.get(n - i);
            intList.get(n - i) = temp;
        }
    }
}

