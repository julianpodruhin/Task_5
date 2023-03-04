package Lab5ex2;

public class Polindrome {
    public static void main (String[] args){
String text = "ABcvvbA 2345 ABba";
        String s1 = text.toUpperCase().replaceAll("[^A-Za-z]","");
        StringBuffer s2=new StringBuffer(s1).reverse();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(isPolindrome ("ABBA BBBB ABba") );
        System.out.println(isPolindrome ("ABBA 2345 AB':ba"));
        System.out.println(isPolindrome ("ABcvvbA 2345 ABba"));
        System.out.println(isPolindrome ("Madam, I'm Adam!"));
    }
    public static boolean isPolindrome(String text){
        /*
        isPolindrome(String) ->boolean;
        >>isPolindrome ("ABBA BBBB ABba") -> true;
        >>isPolindrome ("ABBA 2345 AB':ba") -> true;
        >>isPolindrome ("ABcvvbA 2345 ABba") -> false;
        */
        String s1 = text.toUpperCase().replaceAll("[^A-Za-z]","");
        StringBuffer s2=new StringBuffer(s1).reverse();
        boolean answer = true;
        for (int count=0; count<s1.length(); count++){
            if (s1.charAt(count)!=s2.charAt(count))
                answer = false;
        }
        return answer;
    }
}
