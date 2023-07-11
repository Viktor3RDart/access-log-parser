import java.util.ArrayList;
import java.util.Arrays;

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
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        // Показать первоначальный массив int[] intArray
        System.out.println("Массив int[] intArray: " + Arrays.toString(intArray));
        ArrayList<Integer> intList = new ArrayList<>();
        for (int j : intArray) {
            intList.add(j);
        }
        // Показать первоначальный ArrayList<Integer> intList
        System.out.println("Лист ArrayList<Integer> intList: " + intList + "\n");
        // Показать отсортированный массив int[] intArray
        reverse(intArray);
        System.out.println("Сортировка массива: " + Arrays.toString(intArray));
        // Показать отсортированный массив ArrayList<Integer> intList
        reverse2(intList);
        System.out.println("Сортировка листа:   " + intList);
    }

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
            intList.set(i, intList.get(n - i));
            intList.set((n - i), temp);
        }
    }
}

