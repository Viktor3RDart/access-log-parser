//Есть класс Cat:
//
//public class Cat {
//    private static String breed = "Persian"; // порода
//    public String name;
//    private int age;
//    private List friendsName = new ArrayList<>();
//
//    public Cat(String name, int age, List friendsName) {
//        this.name = name;
//        this.age = age;
//        this.friendsName = friendsName;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", friendsName=" + friendsName +
//                '}';
//    }
//}
//    Нужно написать метод, который будет «обнулять» объект этого класса, то есть присваивать null всем полям.
//    Примитивы обнулять не нужно.
//
//public static void main(String[] args) {
//        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
//        // Обнулить все поля
//        }
//        Подсказка. Лучше сделать универсальный метод, который может обнулить любой объект.
//        Для самопроверки лучше создать похожий класс, например Dog и попробовать его обнулить.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Cat {
    private static String breed = "Persian"; // порода
    public String name;
    private int age;
    private List friendsName = new ArrayList<>();

    public Cat(String name, int age, List friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendsName=" + friendsName +
                '}';
    }
    public void CatNull() {
        this.name = null;
        this.age = 0;
        this.friendsName = null;
        breed = null;
    }

    public static void main(String[] args) {
        ArrayList<String> friend = new ArrayList<>(Arrays.asList("Кожаный мешок","Казачек"));
        Cat cat = new Cat("Вася", 10, friend);
        System.out.println(breed + " " + cat);
        cat.CatNull();
        System.out.println(breed + " " + cat);
    }
}


