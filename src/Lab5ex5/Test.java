package Lab5ex5;

public class Test {
    public static void main(String args[]) {
        StringBuffer buffer = new StringBuffer("The given string is: This is a test string \n" +
                "\n" +
                "The string reversed word by word is: \n" +
                "\n" +
                "sihT si a tset gnirts ");
        buffer.reverse();
        System.out.println(buffer);
    }
}
