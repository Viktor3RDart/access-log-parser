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
        int x1;
        int y1;
        int x2;
        int y2;
        String print;


        public Point(int x1, int y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.print = "short";
        }

        public String toString() {
            if (this.print.equals("short")) {
                return "{" + x1 +
                        ";" + y1 +
                        '}';
            } else return "Линия от {" + x1 + ";" + y1 + "} до {" + x2 + ";" + y2 + "}";
        }
        public int Length(){
            return (int) ((int)  Math.pow((y2 - y1), 2) + Math.pow((x2 - x1),2));
        }
    }
}

