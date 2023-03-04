package Lab5ex1;

import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        String s = "Анаграммы - это пары, тройки и т.д. слов, составленных из одного "
                + "набора букв. Изобретение новых анаграмм (например, апельсин - спаниель) "
                + "всегда было достижением чистого разума интеллектуалов.";
        Arrays.stream(s.replaceAll("\\pP", " ").split("\\s+")).sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1).forEach(m -> System.out.println(m.length()));
    }
}
