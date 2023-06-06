public class Hw5 {
    public static void main(String[] args) {
//        System.out.println(listNums(12));
//        System.out.println(reverseListNums(32));
//        System.out.println(chet(27));
//        System.out.println(pow(3, 8));
//        System.out.println(numLen(80000000));
//        System.out.println(equalNum(1111));
//        square(10);
//        System.out.println(" ");
//        leftTriangle(10);
//        System.out.println(" ");
        rightTriangle(10);
//        guessGame();

    }

    //1. Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    //в которой будут записаны все числа от 0 до x (включительно).
    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res = res + i + " ";
        }
        return res;
    }

    //2. Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    // в которой будут записаны все числа от x до 0 (включительно).
    public static String reverseListNums(int x) {
        String res = "";
        for (int i = x; i >= 0; i--) {
            res = res + i + " ";
        }
        return res;

    }

    //3. Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    // в которой будут записаны все четные числа от 0 до x (включительно).
    // Подсказа для обеспечения качества кода: инструкцию if использовать не следует.
    public static String chet(int x) {
        String res = "";
        for (int i = 2; i < x; i += 2) {
            res = res + i + " ";
        }
        return res;
    }

    //4. Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.
    //
    //Подсказка: для получения степени необходимо умножить единицу на число x, и сделать это y раз,
    // т.е. два в третьей степени это 1*2*2*2
    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 0; i < y; i++) {
            res = res * x;
        }
        return res;
    }

    //5. Необходимо реализовать метод таким образом, чтобы он возвращал количество знаков в числе x.
    public static int numLen(long x) {
        int count = 0;
        while (x != 0) {
            count++;
            x /= 10;
        }
        return count;
    }

    //6. Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы,
    // и false в ином случае.
    //Подсказки:
    //int x=123%10; х будет иметь значение 3
    //int у=123/10; у будет иметь значение 12
    public static boolean equalNum(int x) {
        boolean res = false;
        while (x != 0 && x / 10 != 0) {
            int a = x % 10;
            int b = (x / 10) % 10;
            if (a == b) {
                res = true;
                x /= 10;
            } else return false;
        }
        return res;

    }

    //7. Необходимо реализовать метод таким образом, чтобы он выводил на экран квадрат из символов ‘*’ размером х,
    // у которого х символов в ряд и х символов в высоту. Подсказка: метод System.out.print выводит без перехода
    // на следующую строку, в то время как System.out.println выводит с переходом.
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    //8. Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’
    // у которого х символов в высоту, а количество символов в ряду совпадает с номером строки.
    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");

        }
    }

    //9. Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’
    // у которого х символов в высоту, а количество символов в ряду совпадает с номером строки,
    // при этом треугольник выровнен по правому краю. Подсказка: перед символами ‘*’
    // следует выводить необходимое количество пробелов.
    public static void rightTriangle(int x) {
        int z = x;
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                for (; k <= z; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(" ");
            z -= 1;
            k = 0;
        }
    }

    //10. Данный метод считывает с консоли введенное пользователем число и выводит, угадал ли пользователь то,
    // что было загадано, или нет. Перепишите этот метод таким образом, чтобы он запускался до тех пор,
    // пока пользователь не угадает число. После этого выведите на экран количество попыток,
    // которое потребовалось пользователю, чтобы угадать число.
    //
    //Ответом на задание является измененный метод.
    public static void guessGame() {
        int randomNum = 3;
        int count = 1;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Какое число я загадал (0 до 100)? : ");
        int x = sc.nextInt();
        while (x != randomNum) {
            System.out.println("Не верно, попробуй еще!");
            x = sc.nextInt();
            count++;
        }
        System.out.println("Да, верно это число -  " + randomNum + ". Количество попыток: " + count);
    }
}




//Курсовой проект. Задание по теме "Циклы"
//1. В созданном вами проекте в методе main напишите бесконечный цикл while,
// в котором в консоли будет запрашиваться путь к файлу, который программа затем будет парсить.




