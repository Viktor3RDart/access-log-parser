import java.io.*;
import java.util.ArrayList;

// Задайте лист размерностью N, где N — чётное число, а содержимое — числа от 1 до N.

//Поменяйте местами попарно его элементы. То есть первый со вторым, третий с четвёртым и т.д.

public class List_1 {
    public static void main(String[] args) throws IOException {
        int num = Give_num();
        ArrayList<Integer> NewList = new ArrayList<>();
        if (num > 0) {
            for (int i = 1; i < num + 1; i++) {
                NewList.add(i);
            }
        } else
            for (int i = 1; i > num - 1; i--) {
                NewList.add(i);
            }
        // Показать первоначальным массив.
        System.out.println(NewList);
        for (int i = 0; i < NewList.size(); i++) {
            if (NewList.get(i) % 2 != 0) {
                int a = NewList.get(i);
                int b = NewList.get(i + 1);
                NewList.set(i, b);
                NewList.set(i + 1, a);
                i++;
            }
        }
        // Показать новый массив.
        System.out.println(NewList);
    }

    private static int Give_num() throws IOException {
        System.out.print("Введите четное число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num_int = Integer.parseInt(num);
        while ((num_int % 2 != 0) || num_int == 0) {
            System.out.println("Вы ввели не четное число или 0");
            System.out.print("Введите четное число: ");
            num = reader.readLine();
            num_int = Integer.parseInt(num);
        }
        return num_int;
    }
}
