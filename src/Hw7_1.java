//1. Создайте класс Точка, расположенную на двумерной плоскости, которая описывается:
//
//Координата Х: число
//Координата Y: число
//При создании требует указать обе координаты
//Может возвращать текстовое представление вида “{X;Y}”
//Далее необходимо создать три объекта точки: {1;3} {1;3} {5;8}
//
//Выведите на экран текстовое представление этих точек и результат сравнения точек между собой.
// Убедитесь, что оба сравнения дали false.

public class Hw7_1 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(1, 3);
        Point point3 = new Point(5, 8);
        System.out.println(point1 + " " + point2 + " " + point3);
        System.out.println(point1.equals(point2));
        System.out.println(point2.equals(point3));

    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "{" + x +
                    ";" + y +
                    '}';
        }
    }
}

