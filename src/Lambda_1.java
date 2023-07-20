import java.util.ArrayList;
import java.util.Arrays;

//Перед вами готовый к использованию метод printList(ArrayList<Integer>), который  все элементы списка по порядку
//        выводит в консоль.
//
//        Сейчас метод реализован с использованием оператора for.
//
//        Задача: переписать реализацию метода printList(ArrayList<Integer>), используя метод списка forEach(),
//        принимающий лямбда-выражение. Логика работы метода остается той же.
//
//        Подсказка: нужно использовать лямбда-выражение, передавая его в метод forEach().
public class Lambda_1 {
    public static void printList(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void printList_lambda(ArrayList list) {
        list.stream().forEach(i-> System.out.println(i));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("жук", "Мук", "внук"));
        System.out.println(" - Лист обычный:");
        printList(list2);
        System.out.println(" - Лист лямбда:");
        printList_lambda(list2);
    }
}
