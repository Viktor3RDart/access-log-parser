public class Hw2 {
    public static void main(String[] args) {
        System.out.println("Задание 1: " + fraction(5.9));
        System.out.println("Задание 2: " + sumLastNums(123));
        System.out.println("Задание 3: " + charToNum('1'));
        System.out.println("Задание 4: " + isPositive(10));
        System.out.println("Задание 5: " + is2Digits(100));
        System.out.println("Задание 6: " + isUpperCase('G'));
        System.out.println("Задание 7: " + isInRange(50, -11, 0));
        System.out.println("Задание 8: " + isDivisor(9, 2));
        System.out.println("Задание 9: " + isEqual(6, 5, 5));
        System.out.println("Задание 10 - Итого 4:");
        lastNumSum2(5, 11, 123, 14, 1);


    }

    //1. Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х.
    public static double fraction(double x) {
        int num = (int) x;
        double result = x - num;
        return result;
    }

    //2. Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числа х,
    //предполагая, что знаков в числе не менее двух.
    public static int sumLastNums(int x) {
        int third = x % 10;
        int second = x / 10 % 10;
        return third + second;
    }

    //3. Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”.
    //Необходимо реализовать метод таким образом, чтобы он преобразовывал символ в соответствующее число.
    public static int charToNum(char x) {
        return (int) x;
    }

    //4. Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно положительное.
    public static boolean isPositive(int x) {
        return x >= 0;
    }

    //5. Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно двузначное.
    public static boolean is2Digits(int x) {
        int count = Integer.toString(x).length();
        return count == 2;
    }

    //6. Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал
    //true если это большая буква в диапазоне от ‘A’ до ‘Z’.
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    //7. Метод принимает левую и правую границу (a и b) некоторого числового диапазона.
    //Необходимо реализовать метод таким образом, чтобы он возвращал true, если num входит в указанный диапазон
    // (включая границы). Обратите внимание, что отношение a и b заранее неизвестно
    // (неясно кто из них больше, а кто меньше)
    public static boolean isInRange(int a, int b, int num) {
        int first;
        int last;
        if (a < b) {
            first = a;
            last = b;
        } else {
            first = b;
            last = a;
        }
        return num >= first && num <= last;
    }

    //8. Необходимо реализовать метод таким образом, чтобы он возвращал true если любое из принятых чисел делит
    //другое нацело.
    public static boolean isDivisor(int a, int b) {
        double delete = (double) a / b;
        return delete % 1 == 0;
    }

    //9. Необходимо реализовать метод таким образом, чтобы он возвращал true если все три полученных методом числа равны
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    //10. Выполните с его помощью последовательное сложение пяти чисел: 5, 11, 123, 14, 1, и результат выведите на экран.
    //Постарайтесь выполнить задачу, используя минимально возможное количество вспомогательных переменных.
    //
    //Ответом на данное задание является код метода main, в котором происходит вызов данной функции.
    //
    //Решение выполняется в таком порядке:
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    public static void lastNumSum2(int a, int b, int c, int d, int e) {
        int one = lastNumSum(a, b);
        int two = lastNumSum(one, c);
        int three = lastNumSum(two, d);
        int four = lastNumSum(three, e);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

    }

}
