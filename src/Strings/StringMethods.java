package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello world";

        String s1 = s.toUpperCase();
        System.out.println(s1);

        String s2 = s.toLowerCase();
        System.out.println(s2);

        String s3 = s.replace('o', 'a');
        System.out.println(s3);

        String s4 = s.substring(2, 5);
        System.out.println(s4);

        String s5 = s1.concat(s2);
        System.out.println(s5);

        System.out.println(s.contains("world"));
    }
}
