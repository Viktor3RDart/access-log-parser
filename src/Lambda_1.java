import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Задача состоит в том, чтобы метод getStringFromStream(Stream<String>) превращал входящий поток строк стримов в строку,
//        слова в которой нужно разделить пробелом. Порядок слов в строке должен быть равен порядку слов в потоке.
//
//        Подсказка: Для реализации можно использовать метод collect() у  Stream<String>.
//        В качестве параметра нужно передать коллектор (объект типа Collector<String>).
//        Коллектор можно получить, вызвав метод joining() у класса Collectors.

public class Lambda_1 {
    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>(List.of("Первый", "Второй", "Третий"));
        Stream<String> stream = one.stream();
        System.out.println(getStringFromStream(stream));
    }
}
