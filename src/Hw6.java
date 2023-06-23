import java.util.Arrays;

public class Hw6 {
    public static void main(String[] args) {
        //1.
        int[] arr = {21, 5, -10, 0, 2, 7, -22};
        int[] arr2 = {1, 5, -3, 0, -3, 5, 1};
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        System.out.println(findFirst(arr, 9));
        //2.
        System.out.println(findLast(arr, 9));
        //3.
        System.out.println(maxAbs(arr));
        //4.
        System.out.println(countPositive(arr));
        //5.
        System.out.println(palindrome(arr2));
        //6.
        System.out.println(Arrays.toString(arr3));
        reverse(arr3);
        //7.
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(reverseBack(arr3)) + "\n");
        //8.
        System.out.println(Arrays.toString(concat(arr2, arr3)));
        //9.
        System.out.println(Arrays.toString(findAll(arr2, 1)));
        //10.
        System.out.println(Arrays.toString(deleteNegative(arr2)));
        //11.
        System.out.println(Arrays.toString(add(arr2, 9, 3)));
        //12
        System.out.println(Arrays.toString(add(arr2, arr3, 2)));
    }

    //1. Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr.
    // Если число не входит в массив – возвращается -1.
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //2. Необходимо реализовать метод таким образом, чтобы он возвращал индекс последнего вхождения числа x
    // в массив arr. Если число не входит в массив – возвращается -1.
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //3. Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю (то есть без учета знака)
    // значение массива arr.
    public static int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max)
                max = arr[i];
        }
        return max;
    }

    //4. Необходимо реализовать метод таким образом, чтобы он возвращал количество положительных элементов массива arr.
    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    //5. Необходимо реализовать метод таким образом, чтобы он возвращал true, если массив arr является палиндромом,
    // то есть справа-налево и наоборот читается одинаково
    public static boolean palindrome(int[] arr) {
        int[] arr2 = new int[arr.length];
        int count = 0;
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = arr[count];
            count++;
        }
        return Arrays.equals(arr, arr2);
    }

    //6. Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
    // После проведенных изменений массив должен быть записан задом-наперед
    public static void reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        int count = 0;
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = arr[count];
            count++;
        }
        arr = arr2;
        System.out.println(Arrays.toString(arr) + "\n");
    }

    //7. Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    // в котором значения массива arr записаны задом наперед
    public static int[] reverseBack(int[] arr) {
        int[] arr2 = new int[arr.length];
        int count = 0;
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = arr[count];
            count++;
        }
        return arr2;
    }

    //8. Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    // в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] all = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < all.length; i++) {
            if (i < arr1.length) {
                all[i] = arr1[i];
            } else {
                all[i] = arr2[k];
                k++;
            }
        }
        return all;
    }

    //9. Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    // в котором записаны индексы всех вхождений числа x в массив arr.
    public static int[] findAll(int[] arr, int x) {
        int[] all = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                all[k] = i;
                k++;
            }
        }
        int[] all2 = new int[k];
        for (int i = 0; i < k; i++) {
            all2[i] = all[i];
        }

        return all2;
    }

    //10. Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    // в котором записаны все элементы массива arr кроме отрицательных.
    public static int[] deleteNegative(int[] arr) {
        int[] all = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                all[k] = arr[i];
                k++;
            }
        }
        int[] all2 = new int[k];
        for (int i = 0; i < k; i++) {
            all2[i] = all[i];
        }
        return all2;
    }

    //11. Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    // который будет содержать все элементы массива arr, однако в позицию pos будет вставлено значение x.
    public static int[] add(int[] arr, int x, int pos) {
        for (int i = 0; i < arr.length; i++) {
            if (i == pos) {
                arr[i] = x;
            }
        }
        return arr;
    }

    //12. Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    // который будет содержать все элементы массива arr, однако в позицию pos будут вставлены значения массива ins.
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] all = new int[arr.length + ins.length];
        int k = 0;
        for (int i = 0; i < all.length; i++) {
            if (i == pos) {
                for (int j = 0; j < ins.length; j++) {
                    all[i] = ins[j];
                    i++;
                }
            }
            all[i] = arr[k];
            k++;
        }
        return all;
    }
}

