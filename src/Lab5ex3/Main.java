package Lab5ex3;

public class Main {
    public static void main(String[] args) {
        String source = "Если сделал ляп или даже два. Этот ляп только твой ляп не ляп.";
        source = source.replaceAll("ляп", "[вырезано цензурой]");
        System.out.println(source);
    }
}
